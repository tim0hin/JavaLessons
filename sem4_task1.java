import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class sem4_task1 {
    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами. 
        // Реализуйте метод, который вернет “перевернутый” список. 
        // Постараться не обращаться к листу по индексам.

        String[] strArr = { "A", "B", "C", "D", "E" };
        LinkedList<String> listEl = new LinkedList<>(Arrays.asList(strArr));
        reverse(listEl);
    }

    static void reverse(LinkedList listEl){
        //System.out.println(listEl);   // отладка
        while (!listEl.isEmpty()){
            System.out.println(listEl.pollLast());
        }
    }
}