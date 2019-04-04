package core_java.modifier.access_control;

public class ClassA {
	public int var1;
	protected int var2;
	int var3;
	private int var4;

	public void method() {
		var1 = 1; // 合法
		var2 = 2; // 合法
		var3 = 3; // 合法
		var4 = 4; // 合法

		ClassA a = new ClassA();
		a.var1 = 11; // 合法
		a.var2 = 22; // 合法
		a.var3 = 33; // 合法
		a.var4 = 44; // 合法
	}
}
