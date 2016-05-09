
public class CarOwner {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.start();
		System.out.println(myCar.drive(10));
		myCar.stop();
		
		Car myBond = new JamesBondCar();
		
		myBond.start();
		System.out.println(myBond.drive(10));
		myBond.stop();

	}

}
