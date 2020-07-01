package library;

public class Magazine extends Record {
	
	private String month;
	private int year;
	
	public Magazine() {
		// TODO Auto-generated constructor stub
	}
	
	public Magazine(String name, String month, int year) {
		this.name=name;
		this.month = month;
		this.year = year;
	}

	String getMonth() {
		return month;
	}

	void setMonth(String month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	

	@Override
	void catalog() {
		// TODO Auto-generated method stub
		String[] catEntry= {Integer.toString(ID), name, month, Integer.toString(year)};
		System.out.println(catEntry);

	}

}
