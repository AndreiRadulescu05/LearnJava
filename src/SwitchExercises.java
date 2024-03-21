import java.util.Scanner;


public class SwitchExercises {
    public static void main(String[] args) {
//Ex 1
        System.out.println("Exerciul 1 - Day of the Week ");
        Scanner day = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int zi = day.nextInt();

        switch (zi) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;

        }
//Ex 2


        System.out.println('\n' + "Exerciul 2 - Simple Calculator ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /): ");
        char mathOperator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        switch (mathOperator) {
            case '+':
                System.out.println("Result is: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Result is: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Result is: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result is: " + (firstNumber / secondNumber));
                    break;
                }
            default:
                System.out.println("Error action");
        }

//Ex 3

        System.out.println('\n' + "Exercitiul 3 - Traffic Light Simulator");
        Scanner scanner2 = new Scanner(System.in);


        System.out.println("Enter a traffic light color: ");
        String culoare = scanner2.nextLine();


        switch (culoare) {

            case "red":
                System.out.println("Stop for red!");
                break;
            case "yellow":
                System.out.println("Be careful!");
                break;
            case "green":
                System.out.println("You can go!");
                break;
            default:
                System.out.println("Invalid option!");
        }
    }
}
