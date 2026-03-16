import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String userName = SafeInput.getNonZeroLenString(in, "Please enter your name");
        System.out.println("\nHello, " + userName + "!");

        in.close();
    }
}