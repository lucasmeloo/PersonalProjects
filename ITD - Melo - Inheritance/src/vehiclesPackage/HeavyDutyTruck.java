package vehiclesPackage;

public class HeavyDutyTruck extends Truck {
	private double tonnage;
	private int noOfWheels;
	
	public HeavyDutyTruck(int CVIN, String cMake, String cModel, String cColor, 
			String cCab, int cHorsepower, boolean cHasWinch, 
			double cTonnage, int cNoOfWheels) {
		super(CVIN, cMake, cModel, cColor, cCab, cHorsepower, cHasWinch);
		setTonnage(cTonnage);
		setNoOfWheels(cNoOfWheels);
	}
	public void setTonnage(double cTonnage) {
		tonnage = cTonnage;
	}
	public double getTonnage() {
		return tonnage;
	}
	public void setNoOfWheels(int cNoOfWheels) {
		noOfWheels = cNoOfWheels;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void toString2() {
		System.out.println("\n");
		System.out.println("VIN = " + VIN);
		System.out.println("Make = " + make);
		System.out.println("Model = " + model);
		System.out.println("Color = " + color);
		System.out.println("Cab size = " + cabSize);
		System.out.println("Horsepower = " + horsepower);
		if (hasWinch == true) {
			System.out.println("Has winch");
		}
		else {
			System.out.println("Does not have winch");
		}
		System.out.println("Tonnage = " + tonnage);
		System.out.println("Number of wheels = " + noOfWheels);
	}
}
