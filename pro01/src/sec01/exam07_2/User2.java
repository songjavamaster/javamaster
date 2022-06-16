package sec01.exam07_2;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculatoe(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
		
	}

}
