package solid;

public class GreetRunner {

	public static void main(String[] args) {
		Greeting casual = new CasualGreeting();
		System.out.println(casual.greet());

	}

}
