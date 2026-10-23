import java.util.Scanner;

public class Keerti_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart4(Scanner input) {

        // Prompt user for candy type using camelCase variable
        System.out.print("Enter a type of candy: ");
        String favoriteCandy = input.nextLine();

        // Prompt user for magical object using camelCase variable
        System.out.print("Enter a magical object: ");
        String magicalItem = input.nextLine();

        // Return final story resolution section (NO input.close() call!)
        return "We quickly threw a handful of " + favoriteCandy + " into a glowing " + magicalItem + " to escape!";
    }
}