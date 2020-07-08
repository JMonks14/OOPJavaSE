package solid;

public class BedroomAdder {
	
	public void addBedroom(Penthouse penthouse) {
        penthouse.setSquareFootage(penthouse.getSquareFootage() + 40);

        
            penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 1);
        
    }

}
