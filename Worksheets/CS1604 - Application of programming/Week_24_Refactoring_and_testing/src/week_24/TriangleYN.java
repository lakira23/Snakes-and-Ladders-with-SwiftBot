package week_24;

public class TriangleYN
{
	int a, b, c;
	public TriangleYN(int sd1, int sd2, int sd3)
	{
		a = sd1; b = sd2; c = sd3;
	}
	public void test()
	{
		if ((a + b > c) && (b + c > a) && (c + a > b))
			System.out.println("Valid triangle");
		else
			System.out.println("Invalid triangle");
	}
}