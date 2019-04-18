package core_java.init_class.final_var;

public class Tester {
	
	public static final int a = 2*3; //编译时常量
	
	static {
		System.out.println("加载Tester类...");
	}
}
