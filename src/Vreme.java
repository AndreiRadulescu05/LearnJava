public class Vreme {


    public static boolean isSunny = true;
    public static boolean isWarm = true;
    public static boolean chanceOfRain = false;


    public static String vreme(boolean shouldGoOut) {

        if (isSunny && isWarm) {
            System.out.println("You should go out!");
        } else if (!isSunny && isWarm) {
            System.out.println("You should not go out.");
        } else if (!isSunny || isWarm || chanceOfRain) {
            System.out.println("\n");
            System.out.println("Exercise 3");
            System.out.println("You should go out!");

        }
        return String.valueOf(shouldGoOut);
    }
}
