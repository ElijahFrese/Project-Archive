import javax.swing.JOptionPane;

/**
This program will calculate either minutes, hours, or days
depending on the amount of seconds entered.
Eli Frese
2/10/23 ic4
*/
public class TimeCalculator
{
	public static void main(String[] args)
	{
		String secondsString;
		double seconds;
		double minutes;
		double hours;
		double days;

		secondsString = JOptionPane.showInputDialog("Enter the number of seconds:");
		seconds = Double.parseDouble(secondsString);

		if (seconds < 60)
		{
			System.out.println("Your input was less than a minute long.");
		}
		if (seconds >= 60)
		{
			minutes = (seconds / 60);
			JOptionPane.showMessageDialog(null, "There are "+minutes+
			" minutes in "+seconds+" seconds.");
		}
		if (seconds >= 3600)
		{
			hours = (seconds/3600);
			JOptionPane.showMessageDialog(null, "There are "+hours+
			" hours in "+seconds+" seconds.");

		}
		if (seconds >= 86400)
		{
			days = (seconds/86400);
			JOptionPane.showMessageDialog(null, "There are "+days+
			" days in "+seconds+" seconds.");

		}



	}
}