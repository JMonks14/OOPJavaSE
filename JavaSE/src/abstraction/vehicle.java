package JavaSE.src.abstraction;

public abstract class vehicle{
	
	String name;	
	int noWheels;
	int weight;
	String colour;
	
	vehicle(int noWheels, int weight, String colour) {
		super();
		this.noWheels = noWheels;
		this.weight = weight;
		this.colour = colour;
	}
	

	vehicle(String name, int noWheels, int weight, String colour) {
		super();
		this.name = name;
		this.noWheels = noWheels;
		this.weight = weight;
		this.colour = colour;
	}


	vehicle() {
	
	}
	

	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
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
