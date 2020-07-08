package solid;

public class BackEndDeveloper implements Developer {

	@Override
	public void Develop() {
		writeJavaScript();
	}
		
	public void writeJavaScript() {
		System.out.println("Everything is JavaScript anyway");
	}

	

}
