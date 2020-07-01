package library;

class Book extends Record{
	
	private String author;
	private String publisher;
	private int edition;
	
	
	Book() {
		super();
	}


	Book(String name, String author, String publisher, int edition) {
		super();
		this.name=name;
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
	}
	
	String getAuthor() {
		return author;
	}


	void setAuthor(String author) {
		this.author = author;
	}


	String getPublisher() {
		return publisher;
	}


	void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	int getEdition() {
		return edition;
	}


	void setEdition(int edition) {
		this.edition = edition;
	}

	@Override
	void catalog() {
		// TODO Auto-generated method stub
		String[] catEntry= {Integer.toBinaryString(ID),name, Integer.toString(edition), author, publisher};
		System.out.println(catEntry);
	}

}
