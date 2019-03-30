package core_java.extend.super_word.exam.one;

public class ThisTester {

	int var;

	ThisTester(double var) {
		this.var = (int) var;
	}

	ThisTester(int var) {
		this("Baby");
	}

	ThisTester(String var) {
		this();
		System.out.println(var);
	}

	ThisTester() {
		System.out.println("How are you?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisTester tester = new ThisTester(5);
	}

}
