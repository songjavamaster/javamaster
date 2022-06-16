package sec01.exam04_8;

import java.io.FileInputStream;
import java.io.InputStream;

public class RealExample {

	public static void main(String[] args)throws Exception {
		InputStream is = new FileInputStream("E:/Temp/test1.db");
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println(data);
		}
		is.close();

	}

}
