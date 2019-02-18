
public class Vehicle {
	private String engineType, fuelType;
	private int direction = 0;
	
	public String getEngineType() {
		return this.engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void steerVehicle(char direction) {
		if (direction == 'L')	{
			this.direction = (this.direction +4 - 1)%4;
		}
		if(direction == 'R') {
			this.direction = (this.direction +1)%4;
		}
		System.out.println("Going in direction "+this.direction);
	}
	public String toString() {
		return this.engineType+" "+this.fuelType+" "+this.direction;
	}
}
