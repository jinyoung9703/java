package day07;

public class ColorPoint extends Point{// extends해서 Point에것을 상속 받음
									  // this. 자기 자신을 가리킴
	private String color;

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color+" / ");
		this.showPoint();
	}
}