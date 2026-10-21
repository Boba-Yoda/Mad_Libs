//Nihtahli's Part
import java.util.Scanner; 

public class Anand_MadLibs 
{
    public static void print()
    {

        Scanner sc = new Scanner(System.in);

        //Asks for the spooky action verb and stores it in the variable spookyVerb using the scanner class
        System.out.print("Enter a spooky action verb (past tense): ");
        String spookyVerb = sc.nextLine();

        //Asks for the decimal candy cost and stores it in the variable candyCost using the scanner class
        System.out.print("Enter a decimal candy cost: ");
        double candyCost = sc.nextDouble();
        sc.close();
    }
}
