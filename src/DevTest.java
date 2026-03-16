import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        int anyInt = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered: " + anyInt);

        double anyDouble = SafeInput.getDouble(in, "Enter any double");
        System.out.println("You entered: " + anyDouble);

        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer", 1, 10);
        System.out.println("You entered: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double", 0.5, 10.0);
        System.out.println("You entered: " + rangedDouble);

        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue");
        System.out.println("You entered: " + confirm);

        String ssn = SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + ssn);

        SafeInput.prettyHeader("Message Centered Here");

        in.close();
    }
}
