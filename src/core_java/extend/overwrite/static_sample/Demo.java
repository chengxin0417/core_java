package core_java.extend.overwrite.static_sample;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBaseClass child1 = new StaticChildClass();
		child1.method(1, 2);
		child1.staticMethod(1, 2);
		
		StaticChildClass child2 = new StaticChildClass();
		child2.method(1, 2);
		child2.staticMethod(1, 2);
	}

}
