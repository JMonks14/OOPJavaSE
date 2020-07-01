package JavaSE.src.abstraction;
import java.util.ArrayList;

public class garage {
	
	private static ArrayList<vehicle> vehicles = new ArrayList<vehicle>();
	
	garage(ArrayList<vehicle> vehicles) {
		super();
		garage.vehicles = vehicles;
	}

	public  static void main(String[] args) {
		
		car car1 = new car(4, 1000, "Blue", "Petrol", "Ford");
		vehicles.add(car1);
		motorcycle bike1 = new motorcycle(2, 250, "red", 5, false);
		vehicles.add(bike1);
		lorry redlorry = new lorry(8, 6000, "red", "cruise missiles", "Mercedes");
		lorry yellowlorry = new lorry(8, 6000, "yellow", "pizza", "Mercedes");
		vehicles.add(redlorry);
		addLorry(yellowlorry);
//		removeVehicle(redlorry);
		
		removeCars(vehicles);
//		System.out.println(vehicles;
		dispCost(vehicles);
//		System.out.println(car1.getType());
		
	}
	
	public static void dispCost(ArrayList<vehicle> vehicles) {
		for (vehicle i: vehicles) {
			if (i instanceof lorry) {
				System.out.println("Cost is " + i.getWeight()/1000);
				
			}else if (i instanceof motorcycle) {
				System.out.println("Cost is " + ((motorcycle) i).getNoGears()*10);
			
			} else {
				System.out.println("Cost is " + i.getNoWheels()*6);
			}
		}
	}
	
	public static void addCar(car aCar) {
		vehicles.add(aCar);
	}
	
	public static void addMotorcycle(motorcycle aMotorcycle) {
		vehicles.add(aMotorcycle);
	}
	
	public static void addLorry(lorry aLorry) {
		vehicles.add(aLorry);
	}
	
	public static void removeVehicle(vehicle aVehicle) {
		vehicles.remove(aVehicle);
	}
	
	public static void removeCars(ArrayList<vehicle> vehicles) {
		for (vehicle v: vehicles) {
			if (v instanceof car) 
				System.out.println(v.colour);
		}
	}
	public static void removeMotorcycles() {
		for (int i = 0; i>=vehicles.size(); i++) {
		if (vehicles.get(i) instanceof motorcycle) 
			vehicles.remove(i);
			}
		}
	public static void removelorries() {
			for (int i = 0; i>=vehicles.size(); i++) {
				if (vehicles.get(i) instanceof lorry) 
					vehicles.remove(i);
			}
	}
	
	

}
