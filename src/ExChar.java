public class ExChar {
    public static void main( String [] args) {
//Ex 1 Char (char) Exercises
        System.out.println("Exercitiul 1");
        char m = 'M';
        System.out.println(m);

//Ex 2
        System.out.println("Exercitiul 2");
        char q = 'q';
        System.out.println(Character.toUpperCase(q));

        char W = 'W';
        System.out.println(Character.toLowerCase(W));
//Ex 3
        System.out.println("Exercitiul 3");
        char character = 'b';
        String text = " -this is a text in the middle- ";
        System.out.println(character + (text) +character);


//String (String) Exercises
//Ex 1
        System.out.println("Exercitiul 1");
        String txt = "This is an example of a String variable.";
        System.out.println(txt);

//Ex 2
        String nume = "Alexandru";
        String prenume = "Ionut";
        System.out.println(nume.concat(prenume));
        System.out.println(nume + " " + prenume);


//Ex 3
        System.out.println("Exercitiul 3");
        String text2 = "This is a string for items to be replaced";

        char oldChar = 'i';
        char newChar = '*';

        String replaceText2 = text2.replace(oldChar, newChar);
        System.out.println(replaceText2);
    }
}
