<<<<<<< HEAD
package quiz;

public class ColorTV extends TV01{
	private int color;
	public ColorTV(int size,int color) {
		super(size);//부모변수 소환
		this.color=color;
	}
	public void showInfo() {
		System.out.println(this.getSize()+"인치"+this.color+"컬러");
	}
	public int getColor() {
		return color;	//IPTV에 슈퍼를 만들어줘서 필요없
	}
	
}
=======
package quiz;

public class ColorTV extends TV01{
	private int color;
	public ColorTV(int size,int color) {
		super(size);//부모변수 소환
		this.color=color;
	}
	public void showInfo() {
		System.out.println(this.getSize()+"인치"+this.color+"컬러");
	}
	public int getColor() {
		return color;	//IPTV에 슈퍼를 만들어줘서 필요없
	}
	
}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
