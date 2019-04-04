package core_java.modifier.access_control.other;

import core_java.modifier.access_control.ClassA;

public class ClassD {
	public void method() {
		ClassA a = new ClassA();
		a.var1 = 11; // 合法
		// a.var2 = 22; 不合法,protected类型，不能被访问
		// a.var3 = 33; 不合法，默认访问级别，不能被访问
		// a.var4 = 44; 不合法，私有属性不能被访问
	}
}
