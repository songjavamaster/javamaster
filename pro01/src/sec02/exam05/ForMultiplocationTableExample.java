package sec02.exam05;

public class ForMultiplocationTableExample {

 	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("***"+m+"단***");
			for (int n=1; n<=9; n++){
				System.out.println(m+"x"+n+"="+(m*n));			}
		}

	}

}
//2단만 나오게 할려면 m값을 2로 변경 크거나 같은수이므로 반목문