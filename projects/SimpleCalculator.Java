import java.util.Scanner;

public class Main {
    public static double num1;
    public static double num2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First Number: ");
        num1 = scan.nextDouble();

        System.out.println("First Number: ");
        num2 = scan.nextDouble();

        System.out.println("Operation to be used: ");
        System.out.println("Choose a number: ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = scan.nextInt();


        switch(operation){
            case 1:
                double sum  = num1 + num2;
                System.out.println("The sum of two Number is: " + sum);
                break;
            case 2:
                double diff  = num1 - num2;
                System.out.println("The difference of two Number is: " + diff);
                break;
            case 3:
                double prod  = num1 * num2;
                System.out.println("The product of two Number is: " + prod);
                break;
            case 4:
                double quot  = num1 / num2;
                System.out.println("The quotient of two Number is: " + quot);
                break;
            default:
        }
    }
}