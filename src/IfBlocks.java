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


//Ex 2 - Password Checker

        System.out.println('\n' + "Exercitiul 2 - Password Checker");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a valid password: ");
        String password = scanner1.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak Password");
        //} else if (!password.contains("[0-9]") && password.length() >= 8) {
           // System.out.println("Moderate Password");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("Moderate Password");
        } else {
            System.out.println("Strong Password");
        }

//Ex 3

        System.out.println('\n' + "Exercitiul 3 - Leap Year Checker");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the year: ");

        int year = scanner2.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + " is a leap year");
        }
         else {
            System.out.println(year + " is not a leap year");
        }
    }
}
