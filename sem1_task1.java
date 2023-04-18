public class sem1_task1 {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        int n = 3;
        System.out.println(sumNumbers(n));
    }

    static int sumNumbers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
