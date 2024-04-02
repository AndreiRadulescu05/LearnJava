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

        System.out.println('\n' + "Exercitiul 2 - Count Vowels");

        Scanner sentence = new Scanner(System.in);
        String str = sentence.nextLine();
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;

            }
        }
        System.out.println("Total number of vowels is: " + count);


            //Ex 3


    int[] evenNumber = {1, 2, 6, 7, 8, 11};

    int sum = 0;
    for (int num : evenNumber) {
        if (num % 2 == 0) {
            sum += num;
        }
    }
        System.out.println('\n' + "The sum on even numbers is: " + sum);

    }

}
