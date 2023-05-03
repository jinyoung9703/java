package day07;

public class ColorPointTest {
	public static void main(String[] args) {
		Point point = new Point();
		point.set(10, 10);
		point.showPoint();
		
		ColorPoint colorpint = new ColorPoint();
		colorpint.set(30, 30);
		colorpint.setColor("red");
		colorpint.showColorPoint();
	}
}