package library;

class Person implements IDgen{
	int ID;
	private String firstName;
	private String lastName;
	
	public Person(int iD, String firstName, String lastName) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	int getID() {
		return ID;
	}

	void setID(int iD) {
		ID = iD;
	}

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
//	public void ID_generator() {
		// TODO Auto-generated method stub
		
	}

}
