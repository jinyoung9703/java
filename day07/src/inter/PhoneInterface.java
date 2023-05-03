package inter;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000; // 상수는 대문자로 표현
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo() {
		System.out.println("----PHONE----");
	}
}