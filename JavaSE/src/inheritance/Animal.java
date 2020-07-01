package inheritance;

public class Animal {
	
	private int avgHeight;
	private int noOfEyes;
	private int noOfLegs;
	boolean hasTail;
	
	Animal(int avgHeight, int noOfEyes, int noOfLegs) {
		super();
		this.avgHeight = avgHeight;
		this.noOfEyes = noOfEyes;
		this.noOfLegs = noOfLegs;
	}

	Animal() {
		super();
	}

	int getAvgHeight() {
		return avgHeight;
	}

	void setAvgHeight(int avgHeight) {
		this.avgHeight = avgHeight;
	}

	int getNoOfEyes() {
		return noOfEyes;
	}

	void setNoOfEyes(int noOfEyes) {
		this.noOfEyes = noOfEyes;
	}

	int getNoOfLegs() {
		return noOfLegs;
	}

	void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	boolean isHasTail() {
		return hasTail;
	}

	void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	public void makeLoudNoise() {
		System.out.println("The animal runs away.");
	}
	
	public void feed() {
		System.out.println("Nom Nom Nom");
	}
	
	

}
