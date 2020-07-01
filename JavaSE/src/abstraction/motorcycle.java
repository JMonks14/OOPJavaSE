package JavaSE.src.abstraction;

public class motorcycle extends vehicle {
	
	int noGears;
	boolean onFire;
	
	

	public motorcycle(int noWheels, int weight, String colour, int noGears, boolean onFire) {
		super();
		this.noGears = noGears;
		this.onFire = onFire;
	}
	
	public motorcycle() {
		// TODO Auto-generated constructor stub
	}



	int getNoGears() {
		return noGears;
	}



	void setNoGears(int noGears) {
		this.noGears = noGears;
	}



	boolean isOnFire() {
		return onFire;
	}



	void setOnFire(boolean onFire) {
		this.onFire = onFire;
	}

	@Override
	public void go() {
		System.out.println("It's gone");
	}



	

}
