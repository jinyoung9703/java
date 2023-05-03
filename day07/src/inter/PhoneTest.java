package inter;

public class PhoneTest {
	public static void main(String[] args) {
		Gallaxy gallaxy22 = new Gallaxy();
		gallaxy22.sendCall();
		gallaxy22.receiveCall();
		gallaxy22.sendSMS();
		gallaxy22.samsungPay();
		
		System.out.println("------------");
		
		Iphone iphone10 = new Iphone();
		iphone10.sendCall();
		iphone10.receiveCall();
	
		
		PhoneInterface myPhone = new Gallaxy(); // 타입만 맞춰서 유도리있게 사용가능(업캐스팅)
		
		

	}
}