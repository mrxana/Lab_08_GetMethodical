import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in,
                "Enter SSN in format ###-##-####",
                "^\\d{3}-\\d{2}-\\d{4}$");

        String mNumber = SafeInput.getRegExString(in,
                "Enter UC Student M number (M12345)",
                "^(M|m)\\d{5}$");

        String menuChoice = SafeInput.getRegExString(in,
                "Enter menu choice [O,S,V,Q]",
                "^[OoSsVvQq]$");

        System.out.println("\nValid entries received:");
        System.out.println("SSN: " + ssn);
        System.out.println("M number: " + mNumber);
        System.out.println("Menu choice: " + menuChoice);

    }
}