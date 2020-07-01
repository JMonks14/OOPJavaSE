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
//		vehicles.remove(car1);
//		removeLorries(vehicles);
		fixVehicle(redlorry);
//		System.out.println((vehicles.size()-1));
//		System.out.println(vehicles;
//		clearGarage();
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
//		for (int i = 0; i <=vehicles.size()-1; i++) {
//			if (vehicles.get(i) instanceof car) {
////				vehicles.remove(i);
//				System.out.println(vehicles.get(i));
//				i=0;
		int i=0;
		while (i < vehicles.size()) {
			if (vehicles.get(i) instanceof car) {
				vehicles.remove(i);
				i=0;
			} else {
				i+=1;
			}
		}
	}
	public static void removeMotorcycles(ArrayList<vehicle> vehicles) {
//		for (int i = 0; i>=vehicles.size(); i++) {
//		if (vehicles.get(i) instanceof motorcycle) 
//			vehicles.remove(i);
//			}
//		}
		int i=0;
		while (i < vehicles.size()) {
			if (vehicles.get(i) instanceof motorcycle) {
				vehicles.remove(i);
				i=0;
			} else {
				i+=1;
			}
		}
	}
	public static void removeLorries(ArrayList<vehicle> vehicles) {
//			for (int i = 0; i>=vehicles.size(); i++) {
//				if (vehicles.get(i) instanceof lorry) 
//					vehicles.remove(i);
//			}
		int i=0;
		while (i < vehicles.size()) {
			if (vehicles.get(i) instanceof lorry) {
				vehicles.remove(i);
				i=0;
			} else {
				i+=1;
			}
		}
	}
	public static void fixVehicle(vehicle v) {
		int index = vehicles.indexOf(v);
		int cost = ((vehicles.get(index)).noWheels)*4;
		System.out.println(cost);
	}
	
	public static void clearGarage() {
		vehicles.clear();
	}
	

}
