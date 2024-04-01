import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        //Ex 1
        System.out.println("Exercitiul 1 - Find the Maximum");

        int[] maximumNumbers = {10, 25, 4, 60, 120, 5, 454515};
        int max = maximumNumbers[0];

        for (int num : maximumNumbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The Maximum number from the array is: " + max);


            // Ex 2
            // Count Vowels: Create a program that counts the number of vowels in a given string.
            // Use a for-each loop to iterate through the characters of the string.
            // Consider A, E, I, O, U as vowels for this exercise.

            System.out.println("Exercitiul 2 - Count Vowels");

        Scanner sentence = new Scanner(System.in);
        String str = sentence.nextLine();
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i)  == 'u' ) {
                count++;

            }
        }
        System.out.println("Total number of vowels is: "+ count);


            //Ex 3
            // Sum of Even Numbers: Given an array of integers, write a Java program that calculates
            // the sum of all even numbers in the array using a for-each loop.
            // You can hardcode the array or take input from the user.
            // System.out.println("Exercitiul 3 - Sum of Even Numbers");

    int[] evenNumber = {1, 2, 6, 7, 8, 11};

    int sum = 0;
    for (int num : evenNumber) {
        if (num % 2 == 0) {
            sum += num;
        }
    }
        System.out.println("The sum on even numbers is: " + sum);

    }

}
