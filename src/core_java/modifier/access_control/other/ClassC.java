package core_java.modifier.access_control.other;

import core_java.modifier.access_control.ClassA;

public class ClassC extends ClassA {
	
	public void method() {
		var1 = 1; // 合法
		var2 = 2; // 合法
		//var3 = 3; // 不合法，默认级别只对同一个包下面类开放
		//var4 = 4; // 合法

		ClassA a = new ClassA();
		a.var1 = 11; // 合法
		//a.var2 = 22; // 不合法，子类可以直接访问，不能用对象调用
		//var3 = 33; // 不合法，默认级别只对同一个包下面类开放
		//a.var4 = 44; // 不合法，私有属性，不能被访问
	}
}
