package core_java.init_class.exerice1;

public class BaseTwo extends BaseOne {

	public BaseTwo() {
		a++;
		System.out.println("BaseTwo构造器...");
	}

	static {
		a *= 2;
		System.out.println("BaseTwo静态代码块...");
	}
}
