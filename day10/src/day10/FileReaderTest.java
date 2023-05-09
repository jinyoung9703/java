package day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		// 예외 처리...
		try {
			FileReader fileReader = new FileReader("C:\\Windows\\system.ini");
			int c;
			try {
				while((c= fileReader.read())!=-1) {
					System.out.print((char)c);
				}
				fileReader.close();
			} catch (Exception e) {//exception으로도 표현한다
				e.printStackTrace();
			}
			// 있으면 여기 밑에 있는 코드 실행
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("입출력 오류");
		}
	}
}