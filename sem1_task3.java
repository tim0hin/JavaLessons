public class sem1_task3 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000 
        // (числа, которые делятся только на 1 и на себя без остатка)
        simpleNumbers(1000);
    }

    static void simpleNumbers(int n){
        
        for (int i = 2; i <= n; i++){
            boolean simple = true;
            for (int j = 2; j  < i ; j++) {
                if(i % j == 0){
                    simple = false;
                    break;
                }
            }
            if (simple){
                System.out.printf("%d " ,i);
            }
        }
    }
}
