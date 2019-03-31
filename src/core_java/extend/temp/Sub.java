package core_java.extend.temp;

public class Sub extends Base {
	
	private String str = null;
	
	public Sub() {
		str = "1234";
	}
	
	public void method() {
		System.out.println(str.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.method();
	}

}
