package core_java.init_class.exerice1;

public class BaseOne {
	
	static int a = 1;
	
	static {
		a++;
		System.out.println("BaseOne静态代码块...");
	}
	
	public BaseOne() {
		a++;
		System.out.println("BaseOne构造器...");
	}
}
