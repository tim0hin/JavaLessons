public class sem1_task2 {
    public static void main(String[] args) {
        // Вычислить n! (произведение чисел от 1 до n)
        int n = 3;
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
}
