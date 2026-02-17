package week_21_OOP;

public class Car extends Vehicle
{	
	private double engine_cc;
	public Car()
	{
		super(4, 4,200,40);
		engine_cc = 2000.0;
	}
	public void display()
	{	
		System.out.println();
		System.out.println("***** Car *****");
		super.display();
		System.out.println("Engine_cc: "+ engine_cc);
		
	}
}