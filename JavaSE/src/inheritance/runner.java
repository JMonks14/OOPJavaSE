package inheritance;

public class runner {
	
	public static void main(String[] args) {
			leopard mycat = new leopard();
			mycat.setDefault();
			System.out.println(mycat.getNoOfEyes());
			System.out.println(mycat.getNoSpots());
			mycat.feed();
			mycat.makeLoudNoise();
			System.out.println(mycat.isHasTail());
			
//			monkey jack = new monkey();
//			jack.setDefault();
//			System.out.println(jack.isHasTail());
//			System.out.println(jack.getNoOfLegs());
//			System.out.println(jack.isInTree());
			
			
			
			
	
	}

}
