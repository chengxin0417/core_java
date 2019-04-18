package core_java.init_class.exerice1;

public class ClassDemo extends BaseTwo {
	
	static {
		a++;
		System.out.println("ClassDemo静态代码块...");
	}
	
	public ClassDemo(){
		a++;
		System.out.println("ClassDemo构造器...");
	}
	
	public static void main(String[] args) {
		ClassDemo demo = new ClassDemo();
		System.out.println(demo.a);
	}
			
}
