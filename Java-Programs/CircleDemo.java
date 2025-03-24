import java.util.Scanner;

public class CircleDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double radius;
		double area;
		double diameter;
		double circumference;

		System.out.print("Enter the radius of a circle: ");
		radius = keyboard.nextDouble();

		Circle demoCircle = new Circle(radius);

		area = demoCircle.area();
		diameter = demoCircle.diameter();
		circumference = demoCircle.circumference();

		System.out.println("The circle's area is "+area);
		System.out.println("The circle's diameter is "+diameter);
		System.out.println("The circle's circumference is "+circumference);
	}
}