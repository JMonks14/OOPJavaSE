package JavaSE.src.abstraction;

public class car extends vehicle{
	
	String fuelType="petrol";
	String brand;
	final String type="car";
	
	
	car(int noWheels, int weight, String colour, String fuelType, String brand) {
		super(noWheels, weight, colour);
		this.fuelType = fuelType;
		this.brand = brand;
	}
	car() {
		super();
		// TODO Auto-generated constructor stub
	}
	car(int noWheels, int weight, String colour) {
		super(noWheels, weight, colour);
		// TODO Auto-generated constructor stub
	}
	String getFuelType() {
		return fuelType;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public void go() {
		System.out.println("It's getting going");
	}
	String getType() {
		return type;
	}
	
	

}
