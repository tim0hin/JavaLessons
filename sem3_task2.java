import java.util.ArrayList;
import java.util.Collections;

public class sem3_task2 {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. 
        // Найти минимальное, максимальное и среднее арифметическое из этого списка. 
        // Collections.max()
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 2, 7, 0, 9);
        System.out.println(list);

        System.out.println("min = " + Collections.min(list));
        System.out.println("max = " + Collections.max(list));
        System.out.println("AVG = " + avg(list));
    }

    static double avg(ArrayList<Integer> list){
        long sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        return (double) sum / list.size();
    }
}
