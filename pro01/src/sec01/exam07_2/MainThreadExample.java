package sec01.exam07_2;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculatoe(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculatoe(calculator);
		user2.start();

	}

}
