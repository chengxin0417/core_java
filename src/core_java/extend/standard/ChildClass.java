package core_java.extend.standard;

public class ChildClass extends BaseClass {
	public void methodInChild() {
		publicVar = 99; 
		defaultVar = 99;
		//privateVar = 99; 错误，不能访问private变量
		method();
	}
}
