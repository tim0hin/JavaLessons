import java.util.*;

public class sem5_task2 {
    public static void main(String[] args) {
        // Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
        // Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
        // Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
        // Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
        // Написать программу, 
        // которая найдет и выведет повторяющиеся имена с количеством повторений. 
        // Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

        String[] employees = { "Иван Иванов", "Светлана Петрова", "Кристина Белова",
            "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
            "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
            "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов" };
        
        // Создаем HaspMap. Ключ - имя сотрудника, а значение - количество вхождений.
        HashMap<String, Integer> nameCount = new HashMap<>();
        for (String employee : employees) {
            String firstName = employee.split(" ")[0]; // получаем только имя сотрудника
            if (nameCount.containsKey(firstName)) {
                nameCount.put(firstName, nameCount.get(firstName) + 1);
            } else {
                nameCount.put(firstName, 1);
            }
        }

        // Создаем TreeMap, который будет отсортирован
        // такой вариант почему-то не сработал...
        // TreeMap<String, Integer> sortedNameCount = new TreeMap<>(Comparator.reverseOrder());
        // sortedNameCount.putAll(nameCount);
        TreeMap<String, Integer> sortedNameCount = new TreeMap<>((o1, o2) -> {
            int freqCompare = nameCount.get(o2).compareTo(nameCount.get(o1));
            if (freqCompare == 0) {
                return o1.compareTo(o2);
            }
            return freqCompare;
        });
        sortedNameCount.putAll(nameCount);

        // Выводим результат
        for (Map.Entry<String, Integer> entry : sortedNameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
