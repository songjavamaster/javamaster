package sec01.exam06_3;

public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(0); //exit()<<<메소드 호출하여 JVM을 강제 종료
				//break;        //exit()<<<메소드가 지정하는 int매개값을 종료 상태값이라고함
			}
		}
		System.out.println("마무리 코드");
//위에서 강제종료를 했기때문에 "마무리 코드"가 출력안됨
	}

}
