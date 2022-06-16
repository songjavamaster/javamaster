package sec01.exam07_2;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculatoe(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}

}
