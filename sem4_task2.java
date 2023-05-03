import java.util.LinkedList;

public class sem4_task2 {
    public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами: 
        // enqueue() - помещает элемент в конец очереди, 
        // dequeue() - возвращает первый элемент из очереди и удаляет его, 
        // first() - возвращает первый элемент из очереди, не удаляя.
        
        LinkedList<Integer> myList = new LinkedList<Integer>();
        enqueue(3, myList);
        enqueue(7, myList);
        enqueue(9, myList);
        System.out.println(myList);
        
        System.out.println(dequeue(myList));
        
        System.out.println(first(myList));

        System.out.println(myList);
        
    }

    static void enqueue(Integer item, LinkedList<Integer> myList){
        myList.addLast(item);
    }

    static Integer dequeue(LinkedList myList){
        return (Integer) myList.pollFirst();
    }

    static Integer first(LinkedList myList){
        return (Integer) myList.peekFirst();
    }
}
