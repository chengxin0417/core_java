package core_java.extend.overwrite.static_sample;

public class StaticBaseClass {
	
	public static void staticMethod(int a, int b) {
		System.out.println("我是父类的静态方法staticMethod...");
	}
	
	public void method(int a, int b) {
		System.out.println("我是父类的非静态方法method...");
	}
}
