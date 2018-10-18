package vehiclesPackage;

public class Pickup extends Truck {
	private int usage;
	private int length;
	public Pickup(int CVIN, String cMake, String cModel, String cColor, String cCab, int cHorsepower,
			boolean cHasWinch, int cUsage, int cLength) {
		super(CVIN, cMake, cModel, cColor, cCab, cHorsepower, cHasWinch);
		setUsage(cUsage);
		setLength(cLength);
	}
	public void setUsage(int cUsage) {
		usage = cUsage;
	}
	public int getUsage() {
		return usage;
	}
	public void setLength(int cLength) {
		length = cLength;
	}
	public int getLength() {
		return length;
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
		System.out.println("Pickup usage = " + usage + "km");
		System.out.println("Pickup length = " + length + "m");
		
	}
}
