package sec01.exam02_5;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("E:/Temp/test2.db");
		
		byte[] array = {10,20,30};
		
		os.write(array);
		
		os.flush();
		os.close();

	}

}
