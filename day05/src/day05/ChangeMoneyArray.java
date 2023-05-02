package day05;

public class ChangeMoneyArray {
	public static void main(String[] args) {
		// 배열은 규칙 없는것에 규칙을 만들어 줄때 사용한다
		int units[] = {50000,10000,5000,1000,500,100,50};
		int money = 1876540;
		
		for(int i=0;i<units.length;i++) {
		//	System.out.println(units[i]);
			System.out.println(units[i]+"원="+money/units[i]+"장");
			money = money % units[i];
	
		}
		System.out.println(money+"원");
	}

}