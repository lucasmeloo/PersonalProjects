package vehiclesPackage;

public class Vehicle {
	protected int VIN;
	protected String make; 
	protected String model;
	protected String color;
	//Vehicle constructor
	public Vehicle(int CVIN, String cMake, String cModel, 
			String cColor) {
		VIN = CVIN;
		make = cMake;
		model = cModel;
		color = cColor;
	}
	public void setVIN(int CVIN) {
		VIN = CVIN;
	}
	public int getVIN() {
		return VIN;
	}
	public void setMake(String cMake) {
		make = cMake;
	}
	public String getMake() {
		return make;
	}
	public void setModel(String cModel) {
		model = cModel;
	}
	public String getModel() {
		return model;
	}
	public void setColor(String cColor) {
		color = cColor;
	}
	public String getColor() {
		return color;
	}
	//I had a method called toString(). Even after deleting I keep getting an error for naming another method with the same name. That is why it's called toString2()
	public void toString2() {
		System.out.println("VIN = " + VIN);
		System.out.println("Make = " + make);
		System.out.println("Model = " + model);
		System.out.println("Color = " + color);
		
	}
}