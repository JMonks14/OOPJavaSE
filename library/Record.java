package library;

public abstract class Record {
	
	String name;
	int ID;
	int currentBorrowerID;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getID() {
		return ID;
	}
	void setID(int iD) {
		ID = iD;
	}
	String getCurrentBorrowerID() {
		if (currentBorrowerID > 0) {
		    return Integer.toString(currentBorrowerID);
		} else {
			return "Currently held in Library";
		}
	}
	void checkout(int personID) {
		this.currentBorrowerID = personID;
	}
	void returnitem() {
		this.currentBorrowerID=0;
	}
	abstract void catalog();
}