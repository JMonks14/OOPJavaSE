package inheritance;

public class monkey extends Animal{
	
	private boolean isInTree;
		
	monkey(int avgHeight, int noOfEyes, int noOfLegs, boolean isInTree) {
		super(avgHeight, noOfEyes, noOfLegs);
		this.isInTree = isInTree;
	}
	
	monkey(int avgHeight, int noOfEyes, int noOfLegs) {
		super(avgHeight, noOfEyes, noOfLegs);
	}
	

	public monkey() {
		// TODO Auto-generated constructor stub
	}

	boolean isInTree() {
		return isInTree;
	}

	void setInTree(boolean isInTree) {
		this.isInTree = isInTree;
	}

	void setDefault() {
		this.setHasTail(true);
		this.setAvgHeight(50);
		this.setNoOfEyes(2);
		this.setNoOfLegs(2);
		
	}

}
