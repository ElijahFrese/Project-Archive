public class Temperature
{
	private double fahrenheit;

	public Temperature(double fht)
	{
		fahrenheit = fht;
	}

	public void setFahrenheit(double fht)
	{
		fahrenheit = fht;
	}

	public double getFahrenheit()
	{
		return fahrenheit;
	}

	public double celsius()
	{
		double cels;

		cels = (5.0/9) * (fahrenheit - 32);

		return cels;
	}
	public double kelvin()
	{
		double kelv;

		kelv = ((5.0/9) * (fahrenheit - 32)) + 273;

		return kelv;
	}
}