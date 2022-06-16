package sec01.exam06_1;

public class SportsCarExample{

	public static void main(String[] args) {
		Car car1 =new Car();
		System.out.println("차가 달립니다.");
		for(int i = 0; i<10; i++) {
		car1.speedUp();
		System.out.println("차의 속도:"+car1.speed + "km/h");
		}
		car1.stop();
		
		SportsCar car2 = new SportsCar();
		
		System.out.println("차가 달립니다.");
		
	}
	
	
}

