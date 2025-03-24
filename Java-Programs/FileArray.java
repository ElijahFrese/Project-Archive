import java.io.*;

public class FileArray
{
	public static void writeArray(String myFile, int intArray[])
					throws IOException
	{
		FileOutputStream fstream = new FileOutputStream(myFile);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		for (int i=0; i<intArray.length; i++)
		{
			outputFile.writeInt(intArray[i]);
		}

		outputFile.close();
	}
	public static void readArray(String myFile, int intArray[])
					throws IOException
	{
		int number;
		boolean endOfFile = false;

		FileInputStream fstream = new FileInputStream("myArray.dat");
		DataInputStream inputFile = new DataInputStream(fstream);
		while (!endOfFile)
		{
			try
			{
				number = inputFile.readInt();
				System.out.print(number+" ");
			}
			catch (EOFException e)
			{
				endOfFile = true;
			}

		}
		inputFile.close();
	}
}