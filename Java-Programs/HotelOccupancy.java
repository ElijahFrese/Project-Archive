import java.util.Scanner;

/** HotelOccupancy.java
Finds the occupancy of a hotel, based on the number of
floors, rooms on each floor, and the amount of occupied rooms on each floor.
Eli Frese
2/23/2023
*/

public class HotelOccupancy
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		// initialize variables
		int floors;
		int roomsTotal = 0;
		int occupiedTotal = 0;
		int roomsTemp;
		int occupiedTemp;
		int count;
		int count2;
		int vacancy;
		double occuRate;

		// get # of floors
		System.out.print("How many floors does the Hotel have? ");
		floors = keyboard.nextInt();

		// tests input for at least 1 floor
		while (floors < 1) 
		{
			System.out.print("Invalid. Enter 1 or more. ");
			floors = keyboard.nextInt();
		}

		// for each floor, counts the number of rooms,
		// and how many are occupied.
		for (count = 1; count<=floors; count++)
		{
			// get # of rooms on this floor
			System.out.print("How many rooms does floor "+count+" have? ");
			roomsTemp = keyboard.nextInt();

			// tests input for at least 10 rooms
			while (roomsTemp < 10) 
			{
				System.out.print("Invalid. Enter 10 or more: ");
				roomsTemp = keyboard.nextInt();
			}

			// Adds the rooms on this floor to the total
			roomsTotal += roomsTemp;

			// get # of occupied rooms
			System.out.print("How many occupied rooms does floor "
			+count+" have? ");
			occupiedTemp = keyboard.nextInt();

			// makes sure that value entered is less than the number of rooms
			while (occupiedTemp > roomsTemp)
			{
				System.out.print("Invalid. Enter "+roomsTemp+" or more: ");
				occupiedTemp = keyboard.nextInt();
			}

			occupiedTotal += occupiedTemp;

		}
		// calculate vacant rooms and occupancy rate
		vacancy = (roomsTotal - occupiedTotal);
		occuRate = ((occupiedTotal*1.0) / roomsTotal)*100;

		//display results
		System.out.println("Number of rooms: "+roomsTotal);
		System.out.println("Occupied rooms: "+occupiedTotal);
		System.out.println("Vacant rooms: "+vacancy);
		System.out.printf("Occupany Rate: %.2f%%", occuRate);
		




	}
}