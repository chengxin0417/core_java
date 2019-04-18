package core_java.init_class.exerice2;

public class Base {
	static int a = 1;
	
	static void method() {
		System.out.println("执行Base类里的method方法...");
	}
	
	static {
		System.out.println("初始化Base类...");
	}
}
