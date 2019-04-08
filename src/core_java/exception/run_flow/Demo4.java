package core_java.exception.run_flow;

public class Demo4 {

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
			return "catch";
		} finally {
			System.out.println("c");
		}
	}

}
