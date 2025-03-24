import java.util.Scanner;

public class LargestAndSmallest
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int highest;
		int lowest;
		int input;


		System.out.print("Enter an integer, or -99 to quit: ");
		input = keyboard.nextInt();
		highest = input;
		lowest = input;


		while (input != -99)
		{
			if (input > highest)
			{
				highest = input;
			}
			if (input < lowest)
			{
				lowest = input;
			}
			
			System.out.print("Enter an integer, or -99 to quit: ");
			input = keyboard.nextInt();
		}

		System.out.println("Largest: "+highest);
		System.out.println("Smallest: "+lowest);


	}
}
