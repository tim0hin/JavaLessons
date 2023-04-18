import java.util.Scanner;

public class sem1_task4 {
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите число A: ");
        double a = iScan.nextDouble();
        System.out.println("Введите число B: ");
        double b = iScan.nextDouble();
        System.out.println("Введите желаемую операцию (+,-,*,/): ");
        String operation = iScan.next();
        System.out.println(calc(a, b, operation));
        iScan.close();
    }

    static double calc(double a, double b, String operation){
        double result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        
            default:
                System.out.println("Нет такой операции");
                System.exit(1);
        }
        return result;
    }
}
