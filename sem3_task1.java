import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sem3_task1 {
    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа.
        
        delOdd();
    }

    static void delOdd(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 2, 7, 0, 9);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
