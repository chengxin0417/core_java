package core_java.extend.super_word.exam.two;

public class Demo {
	public static void main(String[] args) {
		go(new MyBase());
		// System.out.println();
	}

	static void go(Base b) {
		int result = b.add(8);
		System.out.println(result);
		// b.print();
	}
}
