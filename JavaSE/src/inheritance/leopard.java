package inheritance;

public class leopard extends Animal{
	
	private int noSpots=100;
		
	leopard(int avgHeight, int noOfEyes, int noOfLegs, int noSpots) {
		super(avgHeight, noOfEyes, noOfLegs);
		this.noSpots = noSpots;
	}
	
	void main(String[] args) {
		this.setAvgHeight(160);
		this.setNoOfEyes(2);
		this.setNoOfLegs(4);
		this.setHasTail(true);
	}


	public leopard() {
		// TODO Auto-generated constructor stub
	}
	void setDefault() {
		this.setAvgHeight(160);
		this.setNoOfEyes(2);
		this.setNoOfLegs(4);
		this.setHasTail(true);
	}
	
	int getNoSpots() {
		return noSpots;
	}

	void setNoSpots(int noSpots) {
		this.noSpots = noSpots;
	}

	@Override
	public void makeLoudNoise() {
		System.out.println("The leopard bites you in the face");
	}
	
	

}
