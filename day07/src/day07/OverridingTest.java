package day07;

class Weapon{
	int fire() {
		return 1;
	}
	
//	int fire(int damage) {
//		return damage;
//	}
}
class Canon extends Weapon{
	
	@Override	//어노테이션
	int fire() {
		return 10;
	}
	
}

// 오버라이딩 : 메소드의 이름, 매개변수 타입과 개수.리턴타입이 모두 동일하여야 성립
// 추상 메소드는 서브 클래스에서 오버라이딩하여 구현
// 추상 클래스는 객체생성할수없다.
public class OverridingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage = weapon.fire();
		System.out.println("Weapon의 데미지는"+weaponDamage);
		
		//동적 바인딩.
		weapon = new Canon();
		int canonDamage = weapon.fire();
		System.out.println("Canon의 데미지는"+canonDamage);
		
	}
}
