import java.util.Scanner;

public class Operators3 {
    public static void main(String [] args) {
//Operators
//Ex 1
        System.out.println("Exercitiul 1 - operatori");
        int a = 100;
        int b = 75;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

//Ex 2 - 2.	Modulus Magic
        System.out.println('\n');
        String[] evenOdd = {"even", "odd"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The number is " + evenOdd[number % 2]);


//Ex 3 - Compound Assignment Operators

        int x = 45;
        x += 5;

        int y = 70;
        y -= 10;

        int z = 3;
        z *= 3;

        int w = 60;
        w /= 6;

        System.out.println('\n' + "Exercitiul 3");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);


    }
}

