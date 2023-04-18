import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

/**
 * sem2
 */
public class sem2 {

    public static void main(String[] args) {
        // System.out.println(ex1("aaaabbbcddaa"));
        // System.out.println(ex2("А роза упала на лапу Азора"));
        ex3("NTCN", 3);
    }

    static String ex1(String s){
        /*
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcddaa.
        Результат: a4b3cd2a2
         */
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                count++;
            } else {
                stringBuilder.append(arr[i-1]);
                if (count > 1){
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(arr[arr.length-1]);
        if (count > 1){
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
    
    static boolean ex2(String s){
          /*
        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
         (возвращает boolean значение).

        Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
         */
        s = s.replace(" ", "");
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.reverse();
        return stringBuilder1.toString().equalsIgnoreCase(s);    
    }

    static void ex3(String s, int n){
        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    private static String repeatString(String s, int n) {
        s.repeat(n);
        return s;
    }

    /**
     * @param s
     */
    static void saveToFile(String s) {
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
        String path = "g/g/g/g/gtest.txt";
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.append(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        System.out.println("Тест");
        fileHandler.close();
    }
}