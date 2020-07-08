package goldilocks;

public class Seat {
	
	int weightCapacity;
	int porridgeTemp;
	
	public Seat(int weightCapacity, int porridgeTemp) {
		super();
		this.weightCapacity = weightCapacity;
		this.porridgeTemp = porridgeTemp;
	}

	public Seat() {
		super();
	}

	public int getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

	public int getPorridgeTemp() {
		return porridgeTemp;
	}

	public void setPorridgeTemp(int porridgeTemp) {
		this.porridgeTemp = porridgeTemp;
	}
	
	

}
