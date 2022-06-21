package memo02;

public class memo {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // 5개의 줄 생성
			for (int j = 1; j <=i; j++) { 
				// 행의 순서만큼(첫번째 줄이면1,두번째 줄이면2...)반복
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}

	}
}