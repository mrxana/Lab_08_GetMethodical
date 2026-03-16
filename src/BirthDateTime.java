import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);

        int maxDay;

        switch(month)
        {
            case 2:
                maxDay = 29;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;

            default:
                maxDay = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, maxDay);
        int hour = SafeInput.getRangedInt(in, "Enter hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter minute", 1, 59);

        System.out.printf("\nYou were born on %d/%d/%d at %02d:%02d%n",
                month, day, year, hour, minute);

    }
}