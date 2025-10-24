import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void GradeCalculator(){

        System.out.println("Subject 1");
        double grade1 = scan.nextDouble();

        System.out.println("Subject 2");
        double grade2 = scan.nextDouble();

        System.out.println("Subject 3");
        double grade3 = scan.nextDouble();

        System.out.println("Subject 4");
        double grade4 = scan.nextInt();

        double totalGrade = grade1 + grade2 + grade3 + grade4;
        double finalGrade = totalGrade / 4;

        System.out.println("Your Final Grade is " + finalGrade);

        if (finalGrade == 100) {
            System.out.println("The Grade equivalent is A");
        } else if (finalGrade >= 90) {
            System.out.println("The Grade equivalent is B");
        } else if (finalGrade >= 80) {
            System.out.println("The Grade equivalent is C");
        } else if (finalGrade >= 70) {
            System.out.println("The Grade equivalent is D");
        } else {
            System.out.println("The Grade equivalent is F");
        }
    }

    public static void main(String[] args) {
        System.out.println("Student Grade Calculator");

        System.out.println("Do you want to Proceed? ");
        String choice = scan.nextLine();

        if (choice.equals("Y") || choice.equals("y")) {
            GradeCalculator();
        } else if (choice.equals("N") || choice.equals("n")) {
            System.exit(1);
        } else {
            System.out.println("Input Error!");
        }
    }
}