public class StringExamples {
    public static void main(String[] args) {

        String greeting = "HELLO";
        String name = "hephaestus";

        //Style 1
        int greetingSize = greeting.length();
        System.out.println(greeting + " has " + greetingSize + " letters");

        //Style 2
        System.out.println(name + " has " + name.length() + " letter");

        String message = "Good morning, Mr. Smith.";

        // Create a program which capitalizes the first letter of any word.

        /*
        1. Get input - users name
        2. isolate the first letter
        3. Capitalize the first letter
        4. isolate everything After first letter
        5. Combine #2 and #4
        6. output
         */

        System.out.println(capitalizeFirst(name));
    }

    public static String capitalizeFirst(String name){

        String firstLetter = name.substring(0, 1);

        firstLetter = firstLetter.toUpperCase();

        String restOfName = name.substring(1);

        return firstLetter + restOfName;




    }



}
