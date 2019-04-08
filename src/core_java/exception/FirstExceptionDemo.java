package core_java.exception;

public class FirstExceptionDemo {

	public static void printString() {
		String x = "a";
		try {
			System.out.println(x.length());
		} catch (NullPointerException e) {
			System.out.println("变量x为null，发生了空指针异常...");
		}finally {
			x = "abc";
		}
		System.out.println(x);
	}
	
	public static void method() {
		printString();
	}
	
	public static void main(String[] args) {
		method();
	}
	
}
