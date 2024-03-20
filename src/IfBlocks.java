import java.util.Scanner;

public class IfBlocks {

    public static void main(String [] args) {

// Ex 1 - 1.	Grade Calculator
        System.out.println("Exercitiul 1 - Grade Calculator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println('A');
        } else if (grade >= 80) {
            System.out.println('B');
        } else if (grade >= 70) {
            System.out.println('C');
        } else if (grade >= 60) {
            System.out.println('D');
        } else
            System.out.println('F');
    }

    
}
