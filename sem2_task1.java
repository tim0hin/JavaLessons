import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class sem2_task1 {
    public static void main(String[] args) {
        /*
         * Дана json строка C [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
         * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
         * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
         * Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
         * Студент Иванов получил 5 по предмету Математика.
         * Студент Петрова получил 4 по предмету Информатика.
         * Студент Краснов получил 5 по предмету Физика.

         * Используйте StringBuilder для подготовки ответа

         * Исходная json строка это просто String !!! Для работы используйте методы String, 
         * такие как replace, split, substring и т.д. по необходимости
         * Создать метод, который запишет результат работы в файл. 
         * Обработайте исключения и запишите ошибки в лог файл.
         */
        String jsonStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},"
        + "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},"
        + "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        
        parsString(jsonStr);
        
    }

    static void parsString(String jsonStr){
        String str1 = jsonStr.replace("{", "");
        String str2 = str1.replace("}","");
        String str3 = str2.replace("[", "");
        String str4 = str3.replaceAll("]", "");
        String str5 = str4.replaceAll("\"", "");
        
        //System.out.println(str5); //debug

        StringBuilder sb = new StringBuilder("");
        String [] strArray = str5.split(",");

        for (int i = 0; i < strArray.length; i+=3){  //для каждого элемента сделать вывод от ":" до конца строки
        String tempStr = "";    
        tempStr += "Студент " + strArray[i].substring(strArray[i].indexOf(":")+1) + " получил " 
            + strArray[i+1].substring(strArray[i+1].indexOf(":")+1) + " по предмету " 
            + strArray[i+2].substring(strArray[i+2].indexOf(":")+1) + "." + "\n";

        sb.append(tempStr);
        }

        saveToFile(sb);
        //System.out.println(sb);

        // for (int i = 0; i < strArray.length; i++){   //debug
        //     System.out.println(strArray[i]);
        // }
        
    }

    static void saveToFile(StringBuilder sb) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        String path = "s2_t2.txt";
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.append(sb);
            fileWriter.flush();
            System.out.println("Файл успешно записан!");
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        fileHandler.close();
    }
}
