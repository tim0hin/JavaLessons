import java.util.*;

public class sem4_task3 {
    public static void main(String[] args) {
        // Найдите сумму всех элементов LinkedList, 
        // сохраняя все элементы в списке. Используйте итератор.   
        LinkedList<Integer> listNums = new LinkedList<>();
        listNums.add(1);
        listNums.add(2);
        listNums.add(3);
        listNums.add(4);

        sumOfList(listNums);

    }

    static void sumOfList(LinkedList listNums){
        Iterator<Integer> iterator = listNums.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            sum += iterator.next();
        }

        System.out.println("Сумма элементов = " + sum);
    }
}
