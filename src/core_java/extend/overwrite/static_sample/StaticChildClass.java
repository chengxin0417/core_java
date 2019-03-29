package core_java.extend.overwrite.static_sample;

public class StaticChildClass extends StaticBaseClass {

	public static void staticMethod(int a, int b) {
		System.out.println("我是子类的静态方法staticMethod...");
	}
	
	public void method(int a, int b) {
		System.out.println("我是子类的非静态方法method...");
	}
}
