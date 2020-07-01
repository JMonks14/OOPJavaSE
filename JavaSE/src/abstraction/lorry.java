package JavaSE.src.abstraction;

public class lorry extends vehicle{
	
	String cargo;
	String brand;
	
	lorry(String cargo, String brand) {
		super();
		this.cargo = cargo;
		this.brand = brand;
	}
	
		
	lorry(int noWheels, int weight, String colour, String cargo, String brand) {
		super(noWheels, weight, colour);
		this.cargo = cargo;
		this.brand = brand;
	}



	String getCargo() {
		return cargo;
	}
	
	void setCargo(String cargo) {
		this.cargo = cargo;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	public lorry() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Its warming up");
	}

}
