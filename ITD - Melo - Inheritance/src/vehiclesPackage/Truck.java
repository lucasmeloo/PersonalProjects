package vehiclesPackage;

public class Truck extends Vehicle {
	protected String cabSize;
	protected int horsepower;
	protected boolean hasWinch;
	
	public Truck(int CVIN, String cMake, String cModel, 
			String cColor, String cCab, int cHorsepower, boolean cHasWinch) {
		super ( CVIN, cMake, cModel, cColor);
		setCabSize(cCab);
		setHorsepower(cHorsepower);
		setHasWinch(cHasWinch);
	}
	public void setCabSize (String cCab) {
		if (cCab == "Quad cab") {
			cabSize = "Quad cab";
		}
		if (cCab == "Double cab") {
			cabSize = "Double cab";
		}
		else {
			cabSize = "Please enter Quad cab or Double cab";
		}
	}
	public String getCabSize () {
		return cabSize;
	}
	public void setHorsepower(int cHorsepower) {
		horsepower = cHorsepower;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHasWinch(boolean cHasWinch) {
		hasWinch = cHasWinch;
	}
	public boolean getHasWinch() {
		return hasWinch;
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
			System.out.println("Truck have a winch");
		}
		if (hasWinch == false) {
			System.out.println("Truck does not have a winch");
		}
		
	}
}
