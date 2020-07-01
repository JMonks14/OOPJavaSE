package library;



public class Library {
	private int noRecords;
	private int noPeople;	
	Library currentLibrary;
	
	Library() {
		super();
	}
	Library getCurrentLibrary() {
		return currentLibrary;
	}
	void setCurrentLibrary(Library currentLibrary) {
		this.currentLibrary = currentLibrary;
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
