package library;

import java.util.ArrayList;

public class Library {
	private int noRecords=1;
	private int noPeople;		
	ArrayList<Record> libCont = new ArrayList<Record>();
	
	void addThesis(Thesis t) {
		libCont.add(t);
		t.setID(noRecords);
		noRecords++;
	}
	
	void addBook(Book b) {
		libCont.add(b);
		b.setID(noRecords);
		noRecords++;
	}
	
	void addMagazinek(Magazine m) {
		libCont.add(m);
		m.setID(noRecords);
		noRecords++;
	}
	
	Library() {
		super();
	}
	
	int getNoRecords() {
		return noRecords;
	}

	void setNoRecords(int noRecords) {
		this.noRecords = noRecords;
	}

	int getNoPeople() {
		return noPeople;
	}

	void setNoPeople(int noPeople) {
		this.noPeople = noPeople;
	}




}
