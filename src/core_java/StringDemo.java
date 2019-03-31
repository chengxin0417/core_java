package core_java;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "dai yanWei";
		System.out.println(name);
		
		System.out.println(name.contains("a"));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(0, 5));
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.replaceAll(" ", ""));
	}

}
