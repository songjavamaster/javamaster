package sec01.exam08_1;

import sec01.exam06_1.Car;

public class ClassExample {

	public static void main(String[] args)throws Exception {
		//첫 번째 방법
		Class clazz = Car.class;
		// 두 번째 방법
		Class clazz1 = Class.forName("sec01.exam06_1.Car");
		//세 번째 방법
		//Car car = new Car();
		//Class clazz3 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		
		

	}

}
