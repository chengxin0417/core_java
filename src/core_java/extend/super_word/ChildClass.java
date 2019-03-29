package core_java.extend.super_word;

public class ChildClass extends BaseClass {
	protected String var = "子类的成员变量";
	
	public void method() {
		System.out.println("调用子类的方法...");
	}
	
	public void test(){
		String var = "局部变量";
		System.out.println("var is " + var);
		System.out.println("this.var is " + this.var);
		System.out.println("super.var is " + super.var);
		method();
		this.method();
		super.method();
	}
}
