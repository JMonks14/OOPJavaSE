package solid;

public class Greeter {
	
	private Greeting greeting;

	Greeter(Greeting greeting) {
		super();
		this.greeting = greeting;
	}

	Greeting getGreeting() {
		return greeting;
	}

	void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public String greet() {
		return this.greeting.greet();
	}
	
}
