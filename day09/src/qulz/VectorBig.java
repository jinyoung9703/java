<<<<<<< HEAD
package qulz;
//-1이 입력될때까지 숫자를 입력받아서 제일 큰 숫자 출력해보기....
//가변형 collection
import java.util.Scanner;
import java.util.Vector;

public class VectorBig {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> vec = new Vector<>();
		System.out.println("-1을 입력할때까지 계속 입력됩니다.");
		while(true) {
			int num = scanner.nextInt();
			if(num==-1) break;
			vec.add(num);
		}
		int biggest = vec.get(0);//10,30,14,2,5,9,300
		for(int i=1;i<vec.size();i++) {
			if(vec.get(i)>biggest) {
				biggest = vec.get(i);
			}
		}
		System.out.println("가장 큰 숫자는 === "+biggest);
	}
}//A,B,C,D,F 7개 과목의 평점내보기...4.5,3.5,3,2,0
=======
package qulz;
//-1이 입력될때까지 숫자를 입력받아서 제일 큰 숫자 출력해보기....
//가변형 collection
import java.util.Scanner;
import java.util.Vector;

public class VectorBig {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> vec = new Vector<>();
		System.out.println("-1을 입력할때까지 계속 입력됩니다.");
		while(true) {
			int num = scanner.nextInt();
			if(num==-1) break;
			vec.add(num);
		}
		int biggest = vec.get(0);//10,30,14,2,5,9,300
		for(int i=1;i<vec.size();i++) {
			if(vec.get(i)>biggest) {
				biggest = vec.get(i);
			}
		}
		System.out.println("가장 큰 숫자는 === "+biggest);
	}
}//A,B,C,D,F 7개 과목의 평점내보기...4.5,3.5,3,2,0
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
