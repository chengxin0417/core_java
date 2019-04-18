package core_java.init_class.final_var.v2;

public class Tester {
	
	public static final int a = (int)(Math.random()*10);
	
	static {
		System.out.println("加载Tester类...");
	}
}
