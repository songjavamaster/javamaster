package sec02.exam03_2;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); (x)
		
		Bus bus = (Bus) vehicle; //강제로 타입 변환
		
		bus.run();
		bus.checkFare();
		

	}

}
