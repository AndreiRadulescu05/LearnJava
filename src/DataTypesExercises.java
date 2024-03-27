/*       Data Types Exercises
       Integer (int) Exercises
       1.	Calculate the Perimeter of a Rectangle:
       Initialize two integers length and width with any values. Calculate and print the perimeter of a rectangle using these variables.
       2.	Convert Minutes into Seconds:
       Initialize an integer minutes with any value. Convert this into seconds and print the result.
       3.	Calculate the Area of a Square
       Initialize an integer side representing the side of a square. Calculate and print the area of the square.

        Double (double) Exercises
        1.	Calculate the Volume of a Cylinder
        Initialize two doubles radius and height for a cylinder. Calculate and print the volume of the cylinder (use Math.PI for π).
        2.	Convert Fahrenheit to Celsius
        Initialize a double fahrenheit with any value. Convert this to Celsius and print the result.
        3.	Calculate the Hypotenuse of a Right-Angled Triangle
        Given the lengths of the two shorter sides of a right-angled triangle, calculate the length of the hypotenuse.
        Remember, the hypotenuse of a right-angled triangle can be found using Pythagoras theorem, which states that the square of the hypotenuse is equal to the sum of the squares of the other two sides.

*/


public class DataTypesExercises {
    public static void main(String[] args) {
// Ex. 1
        int x = 10;
        int y = 15;

        System.out.println("Integer (int) Exercises");
        System.out.println("Exercise 1");
        System.out.println("The rectangle perimeter is equal to " + 2 * (x + y));


//Ex 2

        int a = 35; //minutes
        int b = a * 60;

        System.out.println("\n" + "Exercise 2");
        System.out.println("This is the result when you convert " + a + " minutes into seconds: " + b);


// Ex 3

        int p = 25;
        int p1 = p * p;
        System.out.println("\n" + "Exercise 3");
        System.out.println("If a side of a square is equal with " + p + ", then the square area is equal with " + p1);

//Ex 1

        double r = 24.3;
        double h = 16.2;
        float PI = 3.1416f;
        double V = PI * r * h;
        System.out.println();
        System.out.println("\n" + "Double (double) Exercises");
        System.out.println("Exercise 1");
        System.out.println("Volume of a Cylinder is equal to " + V);

//Ex 2
        double f = 75.9;
        double c = f / 33.8;

        System.out.println("\n" + "Exercise 2");
        System.out.println("The temperature in Celsius degree is " + c);

// Ex 3
        double m, n;
        m = n = 5.1;
        double o = ((m * m) + (n * n));

        System.out.println("\n" + "Exercise 3");
        System.out.println("The Hypotenuse of the Right-Angled Triangle is " + Math.sqrt(o));

//Boolean (boolean) Exercises
//Ex 1
        boolean sky_Is_Blue = true;
        boolean sky_Is_Red = false;

        System.out.println('\n' + "Boolean (boolean) Exercises");
        System.out.println("Exercise 1");
        System.out.println(sky_Is_Blue);
        System.out.println(sky_Is_Red);

//Ex 2

        int d = 10;
        int e = 5;

        System.out.println("\n" + "Exercise 2");
        System.out.println(d < e);

//Ex 3

        System.out.println("\n" + "Exercise 3");
        Vreme.vreme(true);

        }

    public static boolean isSunny = true;
    public static boolean isWarm = true;
    public static boolean chanceOfRain = false;


    public static String vreme(boolean shouldGoOut) {

        if (isSunny && isWarm && (!isSunny || isWarm || chanceOfRain)) {
            System.out.println("You should go out!");
        } else if (!isSunny && isWarm) {
            System.out.println("You should not go out.");
        }
        return String.valueOf(shouldGoOut);
    }


}




