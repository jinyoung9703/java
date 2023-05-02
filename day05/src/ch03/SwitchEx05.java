package ch03;

public class SwitchEx05 {
	public static void main(String[] args) {
		char grade= '0'; //case 옆에 값은 타입에 맞춰줘야한다. 'A':65,'a':97,'0':48
		switch(grade) {
		case 'A':	//A이거나 a이거나 0일 경우
		case 'a':
		case '0':
			System.out.println("최고 등급입니다.");
			break;
		case 'B':	// B 이거나 b인 경우(case)
		case 'b':	
			System.out.println("중간 등급입니다.");
			break;		// switch문 빠져나감
		default :	// 값이 없을 경우 한번만사용됨;
			System.out.println("최저 등급입니다.");
		}
	}
}