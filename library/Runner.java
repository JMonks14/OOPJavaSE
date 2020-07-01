package library;

public class Runner {

	public static void main(String[] args) {
		Library myLibrary= new Library();
		myLibrary.setCurrentLibrary(myLibrary);
		Thesis thesis1 = new Thesis("OPV", "yours truly", "UoN");
		System.out.println(thesis1.getCurrentLibrary());

	}

}
