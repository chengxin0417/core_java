package core_java.extend.standard;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass child = new ChildClass();
		child.publicVar = 1000;
		//child.privateVar = 1000; ChildClass不能访问父类里私有变量
		child.defaultVar = 1000;
		child.method();
		child.methodInChild();
	}

}
