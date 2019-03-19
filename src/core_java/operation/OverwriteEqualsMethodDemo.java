package core_java.operation;

public class OverwriteEqualsMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverwriteEqualsMethod o_1 = new OverwriteEqualsMethod("Tom",1);
		OverwriteEqualsMethod o_2 = new OverwriteEqualsMethod("Tom",1);
		System.out.println(o_1.equals(o_2));
	}

}
