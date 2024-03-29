import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {

        System.out.println("Exercise 1 Loops - Multiplication Table");

        Scanner scanner1 = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter a number between 1 and 10 to show the multiplication table: ");
            number = scanner1.nextInt();
        } while (number < 1 || number > 10);

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }

// Ex 2

        System.out.println("Exercise 2 Loops - Factorial Calculator");
        Scanner scanner = new Scanner(System.in);

        int factorialNumber;
        System.out.print("Enter a positive number to calculate the factorial: ");

        if (scanner.hasNextInt()) {
            factorialNumber = scanner.nextInt();

            if (factorialNumber < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                long result = 1;
                for (int i = 1; i <= factorialNumber; i++) {
                    result *= i;
                }
                System.out.println("The factorial of " + factorialNumber + " is " + result + ".");
            }
        } else {
            System.out.println("Not a number. Please enter a valid integer.");
        }
//Ex 3

        System.out.println("Exercitiul 3 - Countdown Timer");
        
        Scanner scanner2 = new Scanner(System.in);

        int countTimer= scanner2.nextInt();

        while (countTimer >0){
            System.out.println("Remaining: "+countTimer+" seconds");
            try {
                countTimer--;
                Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
            }
            catch (InterruptedException e) {
                
            }
        }
    }

}