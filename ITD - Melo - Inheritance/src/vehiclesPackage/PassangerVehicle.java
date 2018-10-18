package vehiclesPackage;

public class PassangerVehicle extends Vehicle{
	private String type;
	private int noOfPassengers;
	
	public PassangerVehicle(int CVIN, String cMake, String cModel, 
			String cColor, String cType, int cNoOfPassengers) {
		super(CVIN, cMake, cModel, cColor);
		
	}
	public void setType(String cType) {
		type = cType;
	}
	public String getType() {
		return type;
	}
	public void setNoOfPassengers(int cNoOfPassengers) {
		noOfPassengers = cNoOfPassengers;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
}
