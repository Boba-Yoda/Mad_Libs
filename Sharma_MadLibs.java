import java.util.Scanner;

public class Sharma_MadLibs {

    public static void print() {
        Scanner scanner = new Scanner(System.in);

        // Member 2 Inputs
        System.out.print("Enter a spooky adjective: ");
        String spookyAdjective = scanner.nextLine();

        System.out.print("Enter a monster name: ");
        String monsterName = scanner.nextLine();

        scanner.close();
    }
}