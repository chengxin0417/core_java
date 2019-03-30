package core_java.extend.super_word.exam.two;

public class Base {
	int i;

	Base() {
		add(1);
		//System.out.println(i);
	}

	int add(int v) {
		i += v;
		return i;
		//System.out.println(i);
	}

	void print() {
		//System.out.println(i);
	}
}
