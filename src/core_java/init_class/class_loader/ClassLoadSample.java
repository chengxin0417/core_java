package core_java.init_class.class_loader;

public class ClassLoadSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c;
		ClassLoader loader1,loader2;
		loader1 = ClassLoader.getSystemClassLoader(); //获得系统加载器
		System.out.println(loader1); //打印父加载器
		while(loader1 != null) {
			loader2 = loader1;
			loader1 = loader1.getParent();
			System.out.println("loader2的parent is " + loader1);
		}
		
		try {
			c = Class.forName("java.lang.String"); //获得String类的Class对象
			loader1 = c.getClassLoader(); //获得加载String类的加载器
			System.out.println("java.lang.String的加载器是" + loader1);
			c = Class.forName("core_java.init_class.class_loader.ClassA"); //获得core_java.init_class.class_loader.ClassA的Class对象
			loader1 = c.getClassLoader();//获得core_java.init_class.class_loader.ClassA的加载器
			System.out.println("core_java.init_class.class_loader.ClassA的加载器是"+loader1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
