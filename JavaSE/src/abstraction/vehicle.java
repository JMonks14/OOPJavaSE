package JavaSE.src.abstraction;

public abstract class vehicle{
	
	int noWheels;
	int weight;
	String colour;
	
	vehicle(int noWheels, int weight, String colour) {
		super();
		this.noWheels = noWheels;
		this.weight = weight;
		this.colour = colour;
	}

	vehicle() {
	
	}

	int getNoWheels() {
		return noWheels;
	}

	void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}

	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}
	
	String getColour() {
		return colour;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	abstract public void go();
	

}
