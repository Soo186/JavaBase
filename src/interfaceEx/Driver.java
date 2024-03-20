package interfaceEx;
//운전자 클래스

public class Driver {

	//운전한다는 메소드
	void drive(Vehicle vehicle) {
		vehicle.run();
		if(vehicle instanceof  Bus) {


			Bus bus = (Bus) vehicle; //vehicle에서 버스만 캐스팅
			bus.checkFare();
		} if (vehicle instanceof Truck){
			Truck truck = (Truck) vehicle;
			truck.load();
		}
	}
}
