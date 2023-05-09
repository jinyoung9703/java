<<<<<<< HEAD
package day09;

import java.util.Iterator;
import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class PointVectorTest {
	public static void main(String[] args) {
		Vector<Point> pointVec = new Vector<>();

		pointVec.add(new Point(10, 10));
		pointVec.add(new Point(20, 20));
		pointVec.add(new Point(30, 30));
		System.out.println(pointVec.get(0).getX());
		System.out.println(pointVec.get(0).getY());
		System.out.println(pointVec.get(0).toString());
		System.out.println();

		for (int i = 0; i < pointVec.size(); i++) {//Point 값 전부 출력 
			Point point = pointVec.get(i);
			System.out.println(point.toString());
		}
		for(Point point:pointVec) {
			System.out.println();// for is : get을 안써줘도 되고 간략화한다
			System.out.println(point.toString());
		}
		
//		Iterator<Point>it=pointVec.iterator();	//Iterator 써서 사용가능.
//		while(it.hasNext()) {
//			System.out.println(it.next().toString());	
//		}
	
	}
=======
package day09;

import java.util.Iterator;
import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class PointVectorTest {
	public static void main(String[] args) {
		Vector<Point> pointVec = new Vector<>();

		pointVec.add(new Point(10, 10));
		pointVec.add(new Point(20, 20));
		pointVec.add(new Point(30, 30));
		System.out.println(pointVec.get(0).getX());
		System.out.println(pointVec.get(0).getY());
		System.out.println(pointVec.get(0).toString());
		System.out.println();

		for (int i = 0; i < pointVec.size(); i++) {//Point 값 전부 출력 
			Point point = pointVec.get(i);
			System.out.println(point.toString());
		}
		for(Point point:pointVec) {
			System.out.println();// for is : get을 안써줘도 되고 간략화한다
			System.out.println(point.toString());
		}
		
//		Iterator<Point>it=pointVec.iterator();	//Iterator 써서 사용가능.
//		while(it.hasNext()) {
//			System.out.println(it.next().toString());	
//		}
	
	}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
}