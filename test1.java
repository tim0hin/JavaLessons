//Выводим двумерный массив, каждый элемент которого равен строка + столбец

import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите размер двумерного массива:");
        int n = iScanner.nextInt();
        iScanner.close();

        int[][] array = new int[n][n];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                //System.out.printf(" %d ", i+j);
                array[i][j] = i + j;
                System.out.printf(" %d ", array[i][j]);
            }
        }
    }
}
