<<<<<<< HEAD
package day08;

//Rect라는 class를 만든다. width,height equals의 조건을 면적이 같으면 같은 Rect로 인정한다.

class Point02{
	private int x,y;

	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public boolean equals(Object obj) {	//객체와 다른지 아닌지 따질 수 있다.
		Point02 point = (Point02) obj;
		if(x==point.x && y==point.y) {
			return true;
	}
		return true;
		
	}
//	class Rect{
//	private int width,height;
//
//	public Rect(int width, int height) {
//		this.width = width;
//		this.height = height;
//		
//	}
//	public boolean equals(Object obj) {	
//		Rect rect = (Rect) obj;
//		if(rect.width*rect.height==width*height) {
//			return true;
//	}
//		return true;
//		
//	}
	

}

public class EqualsTest {
	public static void main(String[] args) {
		
		Point02 pointA= new Point02(10,10);
		Point02 pointB= new Point02(10,10);// new를 쓰면 생성자체가 따로됨
		Point02 pointC = pointA;
		System.out.println(pointA==pointB);
		System.out.println(pointA==pointC);
		System.out.println(pointA.equals(pointB));// equals는 메서드
		System.out.println(pointA.equals(pointC));
		 
		 
//		Rect rect01 = new Rect(10,10);
//		Rect rect02 = new Rect(50,2);
//		System.out.println(rect01==rect02);
//		System.out.println(rect01.equals(rect02));
		

	}
=======
package day08;

//Rect라는 class를 만든다. width,height equals의 조건을 면적이 같으면 같은 Rect로 인정한다.

class Point02{
	private int x,y;

	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public boolean equals(Object obj) {	//객체와 다른지 아닌지 따질 수 있다.
		Point02 point = (Point02) obj;
		if(x==point.x && y==point.y) {
			return true;
	}
		return true;
		
	}
//	class Rect{
//	private int width,height;
//
//	public Rect(int width, int height) {
//		this.width = width;
//		this.height = height;
//		
//	}
//	public boolean equals(Object obj) {	
//		Rect rect = (Rect) obj;
//		if(rect.width*rect.height==width*height) {
//			return true;
//	}
//		return true;
//		
//	}
	

}

public class EqualsTest {
	public static void main(String[] args) {
		
		Point02 pointA= new Point02(10,10);
		Point02 pointB= new Point02(10,10);// new를 쓰면 생성자체가 따로됨
		Point02 pointC = pointA;
		System.out.println(pointA==pointB);
		System.out.println(pointA==pointC);
		System.out.println(pointA.equals(pointB));// equals는 메서드
		System.out.println(pointA.equals(pointC));
		 
		 
//		Rect rect01 = new Rect(10,10);
//		Rect rect02 = new Rect(50,2);
//		System.out.println(rect01==rect02);
//		System.out.println(rect01.equals(rect02));
		

	}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
}