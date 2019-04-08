package core_java.exception;

public class ExceptionTrace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = null;
		try {
			int i = x.length();
		} catch(NullPointerException e){
			System.out.println(e.getMessage());
			System.out.println("------------------------华丽丽的分割线-----------------------");
			e.printStackTrace();
		}finally {
			System.out.println("我在finally里面...");
		}
		System.out.println("程序结尾...");
	}

}
