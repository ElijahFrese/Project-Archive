import java.io.*;

/**
   This program demonstrates a solution to the
   FileArray Class programming challenge.
*/

public class FileArrayDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8 };
        int[] test = new int[8];

        
        FileArray numArray = new FileArray();

        //write data to the file
        try
        {
            numArray.writeArray("myArray.dat", numbers);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        //display data from the file
        try
        {
            numArray.readArray("myArray.dat", numbers);
        }
        catch (IOException e)
        {
           System.out.println(e.getMessage());
        }


    }    
}