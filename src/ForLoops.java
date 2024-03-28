import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {

        System.out.println("Exercise 1 Loops - Multiplication Table");

        Scanner scanner1 = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a number between 1 and 10 to show the multiplication table: ");
            num = scanner1.nextInt();
        } while (num < 1 || num > 10);

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        // Ex 2
//Factorial Calculator: Create a program that calculates the factorial of a number provided by the user.
// Use a for loop to calculate the factorial.
// Remember, the factorial of n (n!) is the product of all positive integers less than or equal to n.
// n! = 1*2*3*...*n
        
        System.out.println("Exercise 2 Loops - Factorial Calculator");

    }
}