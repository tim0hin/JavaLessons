package Laptops;
import java.util.*;

public class Sem6 {
    public static void main(String[] args) {
        /*
         * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
         * Реализовать в java.
         * Создать множество ноутбуков.
         * Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
         фильтрации и выведет ноутбуки, отвечающие фильтру. 
         * Критерии фильтрации можно хранить в Map. 
            Например: “Введите цифру, соответствующую необходимому критерию:
            1 - ОЗУ
            2 - Объем ЖД
            3 - Операционная система
            4 - Цвет …
         * Далее нужно запросить минимальные значения для указанных критериев 
            - сохранить параметры фильтрации можно также в Map.
         * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
         */
        
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Asus", 8, 512, "Windows 10", "Grey"));
        laptops.add(new Laptop("HP", 6, 256, "Windows 10", "Black"));
        laptops.add(new Laptop("Lenovo", 8, 256, "Windows 11", "White"));
        laptops.add(new Laptop("Acer", 4, 128, "DOS", "Blue"));
        laptops.add(new Laptop("MSI", 16, 1024, "Windows 10", "Black"));

        filterLaptops(laptops);
    }

    // Метод фильтрации ноутбуков
    static void filterLaptops(Set<Laptop> laptops){
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();   
        
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
            "1 - ОЗУ\n" +
            "2 - Объем ЖД\n" +
            "3 - Операционная система\n" +
            "4 - Цвет\n" +
            "0 - Завершить выбор критериев");

        // Сохраняем в MAP критерии фильтрации, пока не нажат 0.
        int criteria;
        do {
            criteria = scanner.nextInt();
            switch (criteria) {
                case 1:
                    System.out.println("Введите минимальный объем ОЗУ:");
                    int ram = scanner.nextInt();
                    filters.put("ram", ram);
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД:");
                    int storage = scanner.nextInt();
                    filters.put("storage", storage);
                    break;
                case 3:
                    System.out.println("Введите операционную систему:");
                    String os = scanner.next();
                    filters.put("os", os);
                    break;
                case 4:
                    System.out.println("Введите цвет:");
                    String color = scanner.next();
                    filters.put("color", color);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Некорректный ввод.");
                    break;
            }
        } while (criteria != 0);

        // Фильтруем множество ноутбуков
        System.out.println("Отфильтрованные ноутбуки:");
        laptops.stream()
                .filter(laptop -> {
                    boolean match = true;
                    for (Map.Entry<String, Object> entry : filters.entrySet()) {
                        switch (entry.getKey()) {
                            case "ram":
                                match = laptop.getRAM() >= (int) entry.getValue();
                                break;
                            case "storage":
                                match = laptop.getValueHDD() >= (int) entry.getValue();
                                break;
                            case "os":
                                match = laptop.getOS().equalsIgnoreCase((String) entry.getValue());
                                break;
                            case "color":
                                match = laptop.getColor().equalsIgnoreCase((String) entry.getValue());
                                break;
                        }
                        if (!match) {
                            break;
                        }
                    }
                    return match;
                })
                .forEach(System.out::println);
    }
}