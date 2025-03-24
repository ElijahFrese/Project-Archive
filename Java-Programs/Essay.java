// Essay.java
// Eli Frese 4/21/2023

public class Essay extends GradedActivity
{
	private double grammer;

	private double spelling;

	private double correctLength;

	private double content;


	public void setScore(double gr, double sp,
						double len, double cnt)
	{
		if (gr >= 0)
		{
			grammer = gr;
		}
		else
		{
			grammer = 0;
		}
		if (sp >=0)
		{
			spelling = sp;
		}
		else
		{
			spelling = 0;
		}
		if (len >=0)
		{
			correctLength = len;
		}
		else
		{
			correctLength = 0;
		}
		if (cnt>=0)
		{
			content = cnt;
		}
		else
		{
			content = 0;
		}
		super.setScore(getScore());
	}

	public void setGrammer(double g)
	{
		grammer = g;
	}

	public void setSpelling(double s)
	{
		spelling = s;
	}
	public void setCorrectLength(double c)
	{
		correctLength = c;
	}
	public void setContent(double c)
	{
		content = c;
	}
	public double getGrammar()
	{
		return grammer;
	}
	public double getSpelling()
	{
		return spelling;
	}
	public double getCorrectLength()
	{
		return correctLength;
	}
	public double getContent()
	{
		return content;
	}
	public double getScore()
	{
		return grammer + spelling + correctLength + content;
	}

}
