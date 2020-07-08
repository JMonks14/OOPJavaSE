package goldilocks;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Integer[][] numbers = {{100,120}, {297,90}, {66,110}, {257,113}, {276,191}, {280,129}};
		Child kid = new Child(numbers[0][0], numbers[0][1]);
		ArrayList<Integer> seats = new ArrayList<Integer>();
		
		
		int i=0;
		for (Integer[] x: numbers) {
			if (i==0) {
				i++;
				}
			
			else {
				Seat seat = new Seat(x[0], x[1]);
				if (seat.getWeightCapacity() >= kid.getWeight() && seat.getPorridgeTemp() <= kid.getMaxTemp()) {
				seats.add(i);
				i++;
				} else {i++;}			
			}
		}
		for (int a:seats) {
			System.out.print(a + " ");
		}
	
	
	}

}
