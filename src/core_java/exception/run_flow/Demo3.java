package core_java.exception.run_flow;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = null;
		try {
			System.out.println("我在try里面...");
			System.out.println(x.length());
			System.exit(0);
		} catch(Exception e){
			System.out.println("我在catch里面...");
			throw e;
		}finally {
			System.out.println("我在finally里面...");
		}
		System.out.println("程序结尾...");
	}

}
