import java.util.Scanner;

/** 
	Calculates the speed of sound in air, water, or steel. Eli Frese 2/3/23
*/

public class TheSpeedOfSound
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double distance;
		double time;
		String medium;

		System.out.print("Enter one of the following: air, water, or steel: ");
		medium = keyboard.nextLine();

		System.out.print("Enter the distance, in feet, the sound wave will travel: ");
		distance = keyboard.nextDouble();


		if (medium.equals("air"))
		{
			time = distance/1100;
			System.out.println("It will take "+time+" seconds.");
		}
		else if (medium.equals("water"))
		{
			time = distance/4900;
			System.out.println("It will take "+time+" seconds.");
		}
		else if (medium.equals("steel"))
		{
			time = distance/16400;
			System.out.println("It will take "+time+" seconds.");
		}
		else
		{
			System.out.println("Please run the program again and enter a valid medium.");
		}




	}
}