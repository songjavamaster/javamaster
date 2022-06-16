package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		/**문자열 찾기 = indexOf()
		 * 매개값으로 주어진 무자열이 시작되는 인덱스 리턴
		 * 주어진 문자열 포함되어 있지 않으면 -1리턴
		 */
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바")!= -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}

	}

}
