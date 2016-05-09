
public class Car {
	int howlong = 0;
	
	public void start()
	{
		System.out.println("Рушили");
	}
	public void stop()
	{
		System.out.println("Давай тормози");
	}
	public int drive(int howlong)
	{
		int distance = howlong*60;
		return distance;
	}
}
