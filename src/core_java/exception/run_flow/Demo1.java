package core_java.exception.run_flow;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("我在try里面...");
			System.exit(0);
		} finally {
			System.out.println("我在finally里面...");
		}
		System.out.println("程序结尾...");
	}

}
