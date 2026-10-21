import java.util.Scanner;

public class Arora_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart2(Scanner sc) {

        // Prompt user for haunted location
        System.out.print("Enter a location: ");
        String hauntedPlace = sc.nextLine();

        // Prompt user for integer ghost count
        System.out.print("Enter an integer number of ghosts: ");
        int ghostCount = sc.nextInt();
        sc.nextLine(); // Clear leftover newline character from buffer

        // Return concatenated story section incorporating int primitive
        return "Near the abandoned " + hauntedPlace + ", " + ghostCount + " ghosts suddenly emerged from the fog!";
    }
}
