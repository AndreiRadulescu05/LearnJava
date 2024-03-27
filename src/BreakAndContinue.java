import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
//Ex 1

        System.out.println("Exercitiul 1 - Find the First Positive Divisor");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int inputNumber = scanner.nextInt();

        for (int i = 2; i <= inputNumber; i++)
            if (inputNumber % i == 0) {
                System.out.println("This is a divisor of " + i);
                break;
            }
//Ex 2

        System.out.println("Exercitiul 2 - Skip Negative Numbers");
        Scanner scanner1 = new Scanner(System.in);

        int totalSum = 0;


        while (true) {
            System.out.println("Enter a number (to exit press 0): ");
            int insertedNumber = scanner1.nextInt();

            if (insertedNumber == 0) {
                System.out.println("Total sum: " + totalSum);
                break;
            } else if (insertedNumber < 0) {
                System.out.println("Negative numbers are skipped.");
                continue;

            }
            totalSum += insertedNumber;
            System.out.println();
        }


        System.out.println("Exercitiul 3 - Guess the Number Game");
        Scanner scanner2 = new Scanner(System.in);

        int randomNumber = 1 + (int) (10 * Math.random());

        int givenTries = 5;
        int i, guess;
        for (i = 1; i <= givenTries; i++) {
            System.out.println("You have " + (givenTries - i + 1) + " tries to guess the number between 1 and 10. Enter a number: ");
            guess = scanner2.nextInt();

            if (randomNumber == guess) {
                System.out.println("You are correct!");
                break;
            } else if (randomNumber > guess) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i > givenTries) {
            System.out.println("You have used all your attempts");
        }
    }
}





