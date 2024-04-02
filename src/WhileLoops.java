import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // Ex 1
        System.out.println("Exercitiul 1 - Input Summation");

        Scanner scanner = new Scanner(System.in);
        int summationNumbers = 0;
        int count = 0;
        int number;

        do {
            number = scanner.nextInt();
            summationNumbers += number;
            count++;
        } while (number != 0);
        System.out.println("The total input summation is: " + summationNumbers);


        //Ex 2

        System.out.println('\n' + "Exercitiul 2 - Guessing Game");

        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();

        int guessNumber = random.nextInt(100) +1;
        int guess = 0;
        System.out.println("Please enter a random number between 1 and 100: ");

        while (guess != guessNumber) {
            System.out.println("Enter a number: ");
            guess = scanner2.nextInt();

            if (guess < guessNumber) {
                System.out.println("The number you have entered is too low.");
            } else if (guess > guessNumber) {
                System.out.println("The number you have entered is too high.");

            } else {
                System.out.println("You guessed the correct number!");
            }
        }

        //Ex 3

        System.out.println('\n' + "Exercitiul 3 - Palindrom Checker");

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner3.nextLine();

        if(isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner3.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
