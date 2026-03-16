import java.util.Scanner;

public class SafeInput
{


    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear newline
                done = true;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("That is not a valid integer.");
            }
        }
        while(!done);

        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear newline
                done = true;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("That is not a valid double.");
            }
        }
        while(!done);

        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear newline

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Input must be between " + low + " and " + high + ".");
                }
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("That is not a valid integer.");
            }
        }
        while(!done);

        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear newline

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Input must be between " + low + " and " + high + ".");
                }
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("That is not a valid double.");
            }
        }
        while(!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if(response.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y or N.");
            }
        }
        while(true);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String response;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();

            if(response.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Input does not match required format.");
            }
        }
        while(!done);

        return response;
    }

    public static void prettyHeader(String msg)
    {
        int totalWidth = 60;
        int innerWidth = totalWidth - 6; // because "***" on left and "***" on right
        int msgLength = msg.length();

        int spacesBefore = (innerWidth - msgLength) / 2;
        int spacesAfter = innerWidth - msgLength - spacesBefore;

        for(int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for(int i = 0; i < spacesBefore; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for(int i = 0; i < spacesAfter; i++)
        {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();

        for(int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}