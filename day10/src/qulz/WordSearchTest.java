package qulz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearchTest {
	public static void main(String[] args) {
		File file = new File("C:\\Temp\\words.txt");
		Vector<String> wordList = new Vector<>();
		Scanner scanner = new Scanner(System.in);

		try {
			FileReader filereader = new FileReader(file);
			BufferedReader wordReader = new BufferedReader(filereader);
			while (true) {
				String line = wordReader.readLine();
				if (line == null)
					break;
				wordList.add(line);
			}
			wordReader.close();
			while (true) {
				System.out.println("단어를 입력하세요>>>");
				String searchWord = scanner.nextLine();
				if (searchWord.equals("종료"))
					break;
				for (int i = 0; i < wordList.size(); i++) {
					String word = wordList.get(i);
					if (word.length() < searchWord.length())
						continue;
					String frontword = word.substring(0, searchWord.length());
					if (searchWord.equals(frontword)) {
						System.out.println(word);
					}
				}

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
