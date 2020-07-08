package solid;

public class Driver {
	
	private int mileage;

	Driver(int mileage) {
		super();
		this.mileage = mileage;
	}
	
	Driver() {
		super();
	}

	int getMileage() {
		return mileage;
	}

	void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	 public void drive(Car car, int milesDriven){
	        this.setMileage(milesDriven);
	        car.setMileage(car.getMileage()+milesDriven);
	 }
	 
	 public static void drive1(Car car, int milesDriven){
	       car.setMileage(car.getMileage()+milesDriven);
	 }

}
