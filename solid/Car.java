package solid;

public class Car {
	
	private String colour;
    private String model;
    private int mileage;
	
    
    Car(String colour, String model, int mileage) {
		super();
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
	}


	Car() {
		super();
	}


	String getColour() {
		return colour;
	}


	void setColour(String colour) {
		this.colour = colour;
	}


	String getModel() {
		return model;
	}


	void setModel(String model) {
		this.model = model;
	}


	int getMileage() {
		return mileage;
	}


	void setMileage(int mileage) {
		this.mileage = mileage;
	}
    
}
