package core_java.operation;

public class EqualsMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		System.out.println(obj1==obj2);
		System.out.println(obj1==obj3);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String ss1 = new String("a");
		ss1 = ss1.intern();
		String ss2 = "a";
		System.out.println(ss1 == ss2);
		
		String s4 = "abc";
		System.out.println(s3==s4);
		
	}

}
