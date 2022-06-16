package sec02.verify.exam11;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("아이디:");
		String name = scanner.nextLine();

		System.out.println("비밀번호:");
		String strPassword = scanner.nextLine();

		int password = Integer.parseInt(strPassword);

		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인성공");
			}
			System.out.println("로그인실패: 패스워드가 틀림");
		} else {
			System.out.println("로그인실패:아이디가 존재하지 않음");
		}
	}

}
