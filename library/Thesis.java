package library;

public class Thesis extends Record {
	
	String author;
	String institution;

	public Thesis() {
		// TODO Auto-generated constructor stub
	}
	
	public Thesis(String name,String author, String institution) {
		super();
		this.name = name;
		this.author = author;
		this.institution = institution;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	String getInstitution() {
		return institution;
	}

	void setInstitution(String institution) {
		this.institution = institution;
	}

	@Override
	void catalog() {
		// TODO Auto-generated method stub
		String[] catEntry = {Integer.toString(ID), name, author, institution};
		System.out.println(catEntry);

	}

}
