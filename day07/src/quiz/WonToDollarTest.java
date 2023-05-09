<<<<<<< HEAD
package quiz;

public class WonToDollarTest {

	public static void main(String[] args) {
		WonToDollar dollarConverter = new WonToDollar(1330);
		dollarConverter.converting();
		double avg = dollarConverter.convert(2);
	//	WonToEuro euroConverter = new WonToEuro(1475);
	//	euroConverter.converting();
	}
}
=======
package quiz;

public class WonToDollarTest {

	public static void main(String[] args) {
//		WonToDollar dollarConverter = new WonToDollar(1330);
//		dollarConverter.converting();
		WonToEuro euroConverter = new WonToEuro(1475);
		euroConverter.converting();
	}
}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
