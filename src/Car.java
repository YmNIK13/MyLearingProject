
public class Car {
	int howlong = 0;
	
	public void start()
	{
		System.out.println("������");
	}
	public void stop()
	{
		System.out.println("����� �������");
	}
	public int drive(int howlong)
	{
		int distance = howlong*60;
		return distance;
	}
}
