import java.util.Scanner;

public class Sharma_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart1(Scanner scanner) {

        // Prompt user and capture spooky adjective using camelCase
        System.out.print("Enter a spooky adjective: ");
        String spookyAdjective = scanner.nextLine();

        // Prompt user and capture monster name using camelCase
        System.out.print("Enter a monster name: ");
        String monsterName = scanner.nextLine();

        // Return concatenated story section (NO scanner.close() call!)
        return "On a spooky Halloween night, a " + spookyAdjective + " " + monsterName + " lurked in the dark.";
    }
}
