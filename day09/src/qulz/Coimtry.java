<<<<<<< HEAD
package qulz;

import java.util.ArrayList;
import java.util.Scanner;

//나라이름과 수도이름
class Nation{
	private String country,capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}



public class Coimtry {
	public static void main(String[] args) {
		ArrayList<Nation> nationList = new ArrayList<>();
		nationList.add(new Nation("한국","서울"));
		nationList.add(new Nation("미국","워싱턴"));
		nationList.add(new Nation("영국","런던"));
		nationList.add(new Nation("프랑스","파리"));
		nationList.add(new Nation("중국","베이징"));
		nationList.add(new Nation("일본","도쿄"));
		nationList.add(new Nation("멕시코","멕시코시티"));
		nationList.add(new Nation("독일","베를린"));
		nationList.add(new Nation("호주","캔버라"));
		
		Scanner scanner = new Scanner(System.in);
		
	
	
		while(true) {
			//한국의 수도는? Math,random()
			int random = (int)(Math.random()*nationList.size());
			Nation nation = nationList.get(random);
			String country = nation.getCountry();
			String capotal = nation.getCapital();
			
			System.out.println(country+"의 수도는?");
			String answer = scanner.next();
			if(answer.equals("exit")) break;
			if(answer.equals(capotal)) System.out.println("딩동댕");
			else System.out.println("땡");
			//정답이 맞으면 딩동댕
			//틀리면 땡
			
			
		}
	}
}








=======
package qulz;

import java.util.ArrayList;
import java.util.Scanner;

//나라이름과 수도이름
class Nation{
	private String country,capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}



public class Coimtry {
	public static void main(String[] args) {
		ArrayList<Nation> nationList = new ArrayList<>();
		nationList.add(new Nation("한국","서울"));
		nationList.add(new Nation("미국","워싱턴"));
		nationList.add(new Nation("영국","런던"));
		nationList.add(new Nation("프랑스","파리"));
		nationList.add(new Nation("중국","베이징"));
		nationList.add(new Nation("일본","도쿄"));
		nationList.add(new Nation("멕시코","멕시코시티"));
		nationList.add(new Nation("독일","베를린"));
		nationList.add(new Nation("호주","캔버라"));
		
		Scanner scanner = new Scanner(System.in);
		
	
	
		while(true) {
			//한국의 수도는? Math,random()
			int random = (int)(Math.random()*nationList.size());
			Nation nation = nationList.get(random);
			String country = nation.getCountry();
			String capotal = nation.getCapital();
			
			System.out.println(country+"의 수도는?");
			String answer = scanner.next();
			if(answer.equals("exit")) break;
			if(answer.equals(capotal)) System.out.println("딩동댕");
			else System.out.println("땡");
			//정답이 맞으면 딩동댕
			//틀리면 땡
			
			
		}
	}
}








>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
