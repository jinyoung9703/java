<<<<<<< HEAD
package qulz;
//x,y, radius가 속성으로 들어간다 equals를 오버라이드 해서 두점의 좌표가 같으면 좌표가 같습니다, 출력 아니면, 좌표가 다릅니다 ,출력

class Circle{
	private int x,y,radius;
		


	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
		public boolean equals(Object obj) {
			Circle circle = (Circle)obj;
			if(circle.x==x && circle.y==y) return true;
			return false;
		
	}
}
//	class  Equals01{
//	private int x,y,radius;
//
//	public Equals01(int x, int y, int radius) {
//		
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//	public boolean equals(Object obj) {
//		Equals01 equals01 =(Equals01) obj;
//		if(x==equals01.x && y==equals01.y &&radius== equals01.radius) {
//			return true;
//		}
//		return true;
//	}
//	
//
//}
public class CircleTest {
	public static void main(String[] args) {
		Circle circle01 = new Circle(10,10,100);
		Circle circle02 = new Circle(10,1,50);
		if(circle01.equals(circle02)) {
			System.out.println("같은 원입니다.");
		}else {
			System.out.println("다른 원입니다.");
		}
		
	}
//	public static void main(String[] args) {
//		Equals01 equalsA=new Equals01(10,10);
//		Equals01 equalsB=new Equals01(10,10);
//		Equals01 equalsC=new Equals01(10,10);
//	}
	
	

}
=======
package qulz;
//x,y, radius가 속성으로 들어간다 equals를 오버라이드 해서 두점의 좌표가 같으면 좌표가 같습니다, 출력 아니면, 좌표가 다릅니다 ,출력

class Circle{
	private int x,y,radius;
		


	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
		public boolean equals(Object obj) {
			Circle circle = (Circle)obj;
			if(circle.x==x && circle.y==y) return true;
			return false;
		
	}
}
//	class  Equals01{
//	private int x,y,radius;
//
//	public Equals01(int x, int y, int radius) {
//		
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//	public boolean equals(Object obj) {
//		Equals01 equals01 =(Equals01) obj;
//		if(x==equals01.x && y==equals01.y &&radius== equals01.radius) {
//			return true;
//		}
//		return true;
//	}
//	
//
//}
public class CircleTest {
	public static void main(String[] args) {
		Circle circle01 = new Circle(10,10,100);
		Circle circle02 = new Circle(10,1,50);
		if(circle01.equals(circle02)) {
			System.out.println("같은 원입니다.");
		}else {
			System.out.println("다른 원입니다.");
		}
		
	}
//	public static void main(String[] args) {
//		Equals01 equalsA=new Equals01(10,10);
//		Equals01 equalsB=new Equals01(10,10);
//		Equals01 equalsC=new Equals01(10,10);
//	}
	
	

}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
