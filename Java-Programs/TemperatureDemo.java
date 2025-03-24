import java.util.Scanner;

public class TemperatureDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double fahrenheit;
		double kelvin;
		double celsius;

		System.out.print("Enter the Fahrenheit temperature: ");
		fahrenheit = keyboard.nextDouble();

		Temperature demoTemp = new Temperature(fahrenheit);

		celsius = demoTemp.celsius();
		kelvin = demoTemp.kelvin();

		System.out.printf("Celsius: %.2f\n", celsius);
		System.out.printf("Kelvin: %.2f\n", kelvin);
	}
}