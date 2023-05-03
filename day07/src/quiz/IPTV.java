package quiz;

public class IPTV extends ColorTV{
	private String ip;
	public IPTV(String ip, int size,int color) {
		super(size,color);
		this.ip=ip;

	}
	public void showInfo() {
		System.out.print("IP 주소는"+ip+" ");
		super.showInfo();
	}
}




/*IPTV는
ColorTv를 상속받아서
String ip를 속성으로 가진다
생성자 함수에
new IPTV("192.168.0.8",66,3840) 
*/