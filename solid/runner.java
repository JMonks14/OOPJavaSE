package solid;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car("blue", "Ford Focus", 4000);
		Driver me = new Driver();
		me.drive(mycar, 50);
		System.out.println(mycar.getMileage());
		System.out.println(me.getMileage());
		Driver.drive1(mycar, 100);
		System.out.println(mycar.getMileage());

	}

}
