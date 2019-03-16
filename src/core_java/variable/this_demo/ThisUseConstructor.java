package core_java.variable.this_demo;

public class ThisUseConstructor {
	
	public ThisUseConstructor(String str) {
		System.out.println(str);
	}
	
	public ThisUseConstructor() {
		this("测试成功...");
	}
	
	public static void main(String[] args) {
		ThisUseConstructor tc = new ThisUseConstructor();
	}
}
