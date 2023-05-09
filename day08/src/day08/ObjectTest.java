<<<<<<< HEAD
package day08;

//inner class
class Point {
	private int x, y;

	public Point(int x, int y) { // super(); 상위 객체 호출,안써도 자동으로 호출됨
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		
		return "Point("+x+","+y+")";
	}

}

public class ObjectTest {
	public static void main(String[] args) {
		Point point = new Point(10, 10);
		Point point02 = new Point(10, 10);
		point.setX(20);
		point.setY(20);
		System.out.println(point.getX());
		System.out.println(point.getY());
		System.out.println(point.getClass());
		System.out.println(point.getClass().getName());
		System.out.println(point.hashCode());
		System.out.println(point02.hashCode());
		System.out.println(point.toString());
		System.out.println(point);
	}
=======
package day08;

//inner class
class Point {
	private int x, y;

	public Point(int x, int y) { // super(); 상위 객체 호출,안써도 자동으로 호출됨
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		
		return "Point("+x+","+y+")";
	}

}

public class ObjectTest {
	public static void main(String[] args) {
		Point point = new Point(10, 10);
		Point point02 = new Point(10, 10);
		point.setX(20);
		point.setY(20);
		System.out.println(point.getX());
		System.out.println(point.getY());
		System.out.println(point.getClass());
		System.out.println(point.getClass().getName());
		System.out.println(point.hashCode());
		System.out.println(point02.hashCode());
		System.out.println(point.toString());
		System.out.println(point);
	}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
}