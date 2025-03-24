import java.util.Scanner;

/*
    This program sorts three names alphabetically.
    Eli Frese
    2/9/23
*/

public class SortedNames
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        String firstName; 
        String secondName;
        String thirdName;
        char firstInitial;
        char secondInitial;
        char thirdInitial;
        String sorted1;
        String sorted2;
        String sorted3;

        //get names
        System.out.print("First Name: ");
        firstName = keyboard.nextLine();
        System.out.print("Second Name: ");
        secondName = keyboard.nextLine();
        System.out.print("Third Name: ");
        thirdName = keyboard.nextLine();        

        //store initials
        firstInitial = firstName.charAt(0);
        secondInitial = secondName.charAt(0);
        thirdInitial = thirdName.charAt(0);

        //compare initials, place names into variables, and print

        if (firstInitial >= secondInitial && 
        firstInitial >= thirdInitial)
        {
            sorted1 = firstName;

            if (secondInitial >= thirdInitial) 
            {
                sorted2 = secondName;
                sorted3 = thirdName;
                System.out.println(sorted3);
                System.out.println(sorted2);
                System.out.println(sorted1);
            }
            else
            {
                sorted3 = secondName;
                sorted2 = thirdName;
                System.out.println(sorted3);
                System.out.println(sorted2);
                System.out.println(sorted1);
            }
        }
        else if (secondInitial >= firstInitial && 
        secondInitial >= thirdInitial)
        {
            sorted1 = secondName;

            if (firstInitial >= thirdInitial)
            {
                sorted2 = firstName;
                sorted3 = thirdName;
                System.out.println(sorted3);
                System.out.println(sorted2);
                System.out.println(sorted1);
            }
            else
            {
                sorted3 = firstName;
                sorted2 = thirdName;
                System.out.println(sorted3);
                System.out.println(sorted2);
                System.out.println(sorted1);
            }
        }
        else if (thirdInitial >= firstInitial && 
        thirdInitial >= secondInitial)
        {
            sorted1 = thirdName;

            if (firstInitial >= secondInitial)
            {
                sorted2 = firstName;
                sorted3 = secondName;
                System.out.println(sorted3);
                System.out.println(sorted2);
                System.out.println(sorted1);
            }
            else
            {
                sorted3 = firstName;
                sorted2 = secondName;
                System.out.println(sorted3);
                System.out.println(sorted2);
                System.out.println(sorted1);
            }
        }


            
    }
}