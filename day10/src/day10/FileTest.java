package day10;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file01 = new File("C:\\Windows\\system.ini");
		System.out.println(file01.getPath());//파일위치
		System.out.println(file01.getName());//파일이름
		System.out.println(file01.getParent());//파일의 부모
		System.out.println(file01.isFile());//지정한 경로에 파일이있는지
		System.out.println(file01.isDirectory());// 지정한 경로에 디렉토리가 있는지
		
		File file02 = new File("C:\\Temp\\sample");// 확장자가 없으면 폴더가 생성된다
		if (!file02.exists())	file02.mkdir(); //한줄이라 중괄호 없어도됨
		file02.renameTo(new File("C:\\Temp\\java_sample"));
		
		File file03 = new File("C:\\Temp");
		File[] subFiles = file03.listFiles();//배열을 리턴함
		for(int i=0;i<subFiles.length;i++) {
			File file = subFiles[i];
		//	System.out.println(file.getName());
		}
	}
}