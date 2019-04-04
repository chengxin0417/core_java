package core_java.modifier.access_control;

public class ClassB {
	public void method() {

		ClassA a = new ClassA();
		a.var1 = 11; // 合法
		a.var2 = 22; // 合法
		a.var3 = 33; // 合法
		//a.var4 = 44;  编译出错，不合法
	}
}
