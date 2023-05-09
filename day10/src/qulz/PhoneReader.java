package qulz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PhoneReader {
	public static void main(String[] args) {
		File phone = new File("C:\\Temp\\phone.txt");
		try {
			int c;
			FileReader fileReader = new FileReader(phone);
			while((c= fileReader.read())!=-1) {
//			while (true) {
//				c = fileReader.read();			//이런 방법도 있다
//				if (c == -1)
//					break;
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
