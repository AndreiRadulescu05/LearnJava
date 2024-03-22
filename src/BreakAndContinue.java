import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
//Ex 1

        System.out.println("Exercitiul 1 - Find the First Positive Divisor");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number higher than 100: ");
        int inputNumber = scanner.nextInt();

        for (int i = 2; i <= inputNumber; i++)
            if (inputNumber % i == 0) {
                System.out.println("This is a divisor of " + i);
                break;
            }


    }
}
