package library;

public class Runner {

	public static void main(String[] args) {
		Library myLibrary= new Library();
		Thesis t1= new Thesis("OPV", "Yo", "UoN");
		myLibrary.addThesis(t1);
		System.out.println(t1.getID());
		
		

	}

}
