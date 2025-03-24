import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.*;
/**         
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.				
*/

public class StatsDemo
{
	// TASK #3 Add the throws clause
	public static void main(String[] args) throws IOException
	{
		double sum = 0;      // The sum of the numbers
        int count = 0;       // The number of numbers added
		double mean = 0;     // The average of the numbers
        double stdDev = 0;   // The standard deviation
		String line;		 // To hold a line from the file
        double difference;   // The value and mean difference
      double variance; // difference divided by counter

		// Create an object of type Scanner
		Scanner keyboard = new Scanner (System.in);				
		String filename;     // The user input file name

		// Prompt the user and read in the file name
		System.out.println("This program calculates " +     
						   "statistics on a file " +
                           "containing a series of numbers");
		System.out.print("Enter the file name:  ");
		filename = keyboard.nextLine();

		// ADD LINES FOR TASK #4 HERE
		// Create a FileReader object passing it the filename
		File FileReader = new File(filename);
		// Create a BufferedReader object passing FileReader
		// object
		Scanner inputFile = new Scanner(FileReader);
		// Perform a priming read to read the first line of
		// the file
		line = inputFile.nextLine();
		// Loop until you are at the end of the file
		while (inputFile.hasNext())
		{
			// Convert the line to a double value and add the
		// value to sum
			sum += Double.parseDouble(line);
			// Increment the counter
			count += 1;
			// Read a new line from the file
			line = inputFile.nextLine();
		}

		// Close the input file
		inputFile.close();
		// Store the calculated mean
		mean = sum / count;


		// ADD LINES FOR TASK #5 HERE
		// Reconnect FileReader object passing it the
		// filename
		File FileReader1 = new File(filename);
		// Reconnect BufferedReader object passing
		// FileReader object
		Scanner inputFile1 = new Scanner(FileReader1);
		// Reinitialize the sum of the numbers
		sum = 0;
		// Reinitialize the number of numbers added
		count = 0;
		// Perform a priming read to read the first line of
		// the file
		line = inputFile1.nextLine();
		// Loop until you are at the end of the file
		while (inputFile1.hasNext())
		{
			// Convert the line into a double value and
			// subtract the mean
			difference = Double.parseDouble(line) - mean;
			// Add the square of the difference to the sum
			sum += Math.pow(difference, 2);
			// Increment the counter
			count += 1;
			// Read a new line from the file
			line = inputFile1.nextLine();
		}
		// Close the input file
		inputFile1.close();
		// calculate the variance
		variance = sum / count;
		// Store the calculated standard deviation
		stdDev = Math.sqrt(variance);
		
		
		
		
		

		// ADD LINES FOR TASK #3 HERE
		// Create a FileWriter object using "Results.txt"
		FileWriter fwriter = new FileWriter("Results.txt", true);
		// Create a PrintWriter object passing the
		// FileWriter object
		PrintWriter outputFile = new PrintWriter(fwriter);
		// Print the results to the output file
		outputFile.printf("%.3f\n", mean);
		outputFile.printf("%.3f\n", stdDev);
		
		// Close the output file
		outputFile.close();
	}
}
