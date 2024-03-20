package interfaceEx;

public class DriveEx01 {
	public static void main(String[] args) {
		Driver gildong = new Driver();
		Bus bus_33 = new Bus();
		Taxi ptaxi = new Taxi();
		gildong.drive(bus_33);
		gildong.drive(ptaxi);

		Driver chulsu = new Driver();
		Truck truck = new Truck();
		chulsu.drive(truck);

	}
}
