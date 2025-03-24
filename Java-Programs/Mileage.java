import java.util.Scanner;

/**
This program calculates the mileage of a vehicle. Written by Eli Frese, 2/2/23.
*/

public class Mileage
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double milesDriven; // Miles the vehicle drove
		double gallonsUsed; // Gallons used by the vehicle
		double mpg; // Miles per Gallon


		System.out.println("This program will calculate mileage."); // Tells the user what the program does

		// Gets the miles driven from the user
		System.out.println("Enter miles driven: ");
		milesDriven = keyboard.nextDouble(); 

		// Gets gallons used from the user
		System.out.println("Enter gallons used: ");
		gallonsUsed = keyboard.nextDouble(); 

		mpg = (milesDriven/gallonsUsed); // Calculates miles per gallon

		System.out.println("Your vehicle gets "+mpg+" miles per gallon"); // displays results



		// Add your declaration and code here.
	}
}