package week_21_OOP;

public class Vehicle
{
	private int nwheels;
	private int nseats;
	public Vehicle(int nw, int num_seats)
	{
		nwheels = nw;
		nseats = num_seats;
	}
	public void display()
	{
		System.out.println("Number of wheels = "+nwheels);
		System.out.println("Number of seats = "+nseats);
	}
}