import java.util.Scanner;

public class runnerRaj_MadLibs {
    public static void main(String[] args) {
        
        // Output Mad Lib story with blanks
        System.out.println("On a spooky Halloween night, a [spookyAdjective] [monsterName] lurked in the dark. Near the abandoned [hauntedPlace] , [ghostCount] ghosts suddenly emerged from the fog! They [spookyVerb] loudly while demanding $[candyCost] worth of treats. We quickly threw a handful of [favoriteCandy] into a glowing [magicalItem] to escape!");
        
        // Instantiate a single shared Scanner for the entire program execution
        Scanner sc = new Scanner(System.in);

        // Sequentially collect story parts from each team member's method
        String part1 = Sharma_MadLibs.getPart1(sc);
        String part2 = Arora_MadLibs.getPart2(sc);
        String part3 = Anand_MadLibs.getPart3(sc);
        String part4 = Keerti_MadLibs.getPart4(sc);

        // Output completed Mad Lib story
        System.out.println("\n--- YOUR COMPLETED HALLOWEEN STORY ---");
        System.out.println(part1 + " " + part2 + " " + part3 + " " + part4);

        sc.close(); // Close Scanner once at the very end of main
    }
}