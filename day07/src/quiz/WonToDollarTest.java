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
