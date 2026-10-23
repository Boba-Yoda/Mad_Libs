//Nihtahli's Part
import java.util.Scanner;

public class Anand_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart3(Scanner sc) {

        // Prompt user for spooky action verb
        System.out.print("Enter a spooky action verb (past tense): ");
        String spookyVerb = sc.nextLine();

        // Prompt user for double precision decimal candy cost
        System.out.print("Enter a decimal candy cost: ");
        double candyCost = sc.nextDouble();
        sc.nextLine(); // Clear leftover newline character from buffer

        // Return concatenated story section incorporating double primitive
        return "They " + spookyVerb + " loudly while demanding $" + candyCost + " worth of treats.";
    }
}
