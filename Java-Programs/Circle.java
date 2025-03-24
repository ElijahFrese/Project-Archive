

public class Circle
{
	private double radius;
	private final double PI = 3.14159;

	public Circle(double rad)
	{
		radius = rad;
	}

	public Circle()
	{
		radius = 0.0;
	}

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public double getRadius()
	{
		return radius;
	}

	public double area()
	{
		return (PI * radius * radius);
	}

	public double diameter()
	{
		return radius * 2;
	}

	public double circumference()
	{
		return 2 * PI * radius;
	}


}