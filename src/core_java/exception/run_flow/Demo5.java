package core_java.exception.run_flow;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method());
		System.out.println("End");
	}

	public static String method() {
		String x = null;
		try {
			System.out.println("a");
			System.out.println(x.length());
			return "try";
		} catch (Exception e) {
			System.out.println("b");
			x = "catch";
			return x;
		} finally {
			x = "finally";
			System.out.println("c");
		}
	}

}
