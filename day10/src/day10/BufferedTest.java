package day10;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedTest {
	public static void main(String[] args) {
		int c;
		try {
			FileReader fileReader = new FileReader("C:\\Temp\\test02.txt");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out,5);//크기 
			while((c=fileReader.read())!=-1) {
				bufferedOutputStream.write(c);
			}
			//bufferedOutputStream.flush();// 강제로 남은거 밀어 넣어라.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}