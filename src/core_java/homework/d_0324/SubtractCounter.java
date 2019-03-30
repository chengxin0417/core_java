package core_java.homework.d_0324;

public class SubtractCounter extends BasicCounter {

	@Override
	public String processNumber(String num1, String num2) {
		if (num1.contains(".") || num2.contains(".")) {
			double result = Double.valueOf(num1) - Double.valueOf(num2);
			return String.valueOf(result);
		}
		long result = Long.valueOf(num1) - Long.valueOf(num2);
		return String.valueOf(result);
	}

}
