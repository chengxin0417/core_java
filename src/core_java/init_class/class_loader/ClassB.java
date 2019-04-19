package core_java.init_class.class_loader;

public class ClassB {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		ClassLoader loader = ClassLoader.getSystemClassLoader();//获得系统类加载器
		Class obj = loader.loadClass("core_java.init_class.class_loader.ClassA"); //加载ClassA
		System.out.println("After load ClassA...");
		System.out.println("Before init ClassA...");
		obj = Class.forName("core_java.init_class.class_loader.ClassA"); //初始化ClassA
	}

}
