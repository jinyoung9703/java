<<<<<<< HEAD
package quiz;

public class WonToDollar extends Converter{

	
	public WonToDollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	public double convert(double src) {
		
		double num = Math.pow(10, src);
		double avg = Math.round((src/ratio)/2*num);
				
		return avg;
	}

	@Override
	public String srcString() {

		return "원";
	}

	@Override
	public String destString() {

		return "달러";
	}

}
=======
package quiz;

public class WonToDollar extends Converter{
	
	public WonToDollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	public double convert(double src) {

		return src/ratio;
	}

	@Override
	public String srcString() {

		return "원";
	}

	@Override
	public String destString() {
		
		return "달러";
	}

}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
