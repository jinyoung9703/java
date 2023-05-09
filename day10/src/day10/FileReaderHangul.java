package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
//home end 키 앞뒤
//shift end 한줄 주석
public class FileReaderHangul {
	public static void main(String[] args) {
		try {
			FileInputStream filenInputStream = new FileInputStream("C:\\Temp\\hangul.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(filenInputStream,"MS949");//국제표준 utf-8쓰자.
			System.out.println("인코딩 방식은==="+inputStreamReader.getEncoding());
			int c;
			while((c = inputStreamReader.read()) != -1){
				System.out.print((char)c);
			}
			inputStreamReader.close();
			filenInputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
