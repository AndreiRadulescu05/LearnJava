
import java.util.Scanner;
public class CGPT {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int divisor = 2; // Starting from 2 since 1 is not considered
            boolean found = false;

            while (divisor <= number / 2) {
                if (number % divisor == 0) {
                    found = true;
                    break;
                }
                divisor++;
            }

            if (found) {
                System.out.println("The first positive divisor (other than 1) of " + number + " is: " + divisor);
            } else {
                System.out.println("There is no positive divisor (other than 1) for the entered number.");
            }
        }

}
