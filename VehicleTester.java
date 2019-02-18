
public class VehicleTester {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.steerVehicle('L');
		v1.steerVehicle('L');
		v1.steerVehicle('L');
		v1.steerVehicle('L');
		
		Water v2 = new Water();
		v2.steerVehicle('R');
		v2.dropAnchor();
		v2.dropAnchor();
		System.out.println("The toString for this class says: " + v2.toString());
	}
}
