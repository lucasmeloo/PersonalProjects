package vehiclesPackage;

public class ProjectDriver {
	public static void main( String[] args ) {
		Vehicle lucasCar = new Vehicle(1, "BMW", "X2", "Blue");
		lucasCar.toString2();
		Truck lucasTruck = new Truck(2, "Mercedes-Benz", "Arocs", 
				"Dark Green", "Double cab", 380, false);
		lucasTruck.toString2();
		HeavyDutyTruck lucasHeavyTruck = new HeavyDutyTruck(3, "Mercedes-Benz", 
				"Arocs", "Black", "Double cab", 355, false, 4000, 8);
		lucasHeavyTruck.toString2();
		Pickup lucasPickup = new Pickup(4, "Ford", "F250", "Grey","Quad cab",
				250, false, 180000, 4);
		lucasPickup.toString2();
		
	}
}
