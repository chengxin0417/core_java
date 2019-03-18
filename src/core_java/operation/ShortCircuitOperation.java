package core_java.operation;

/**
 * 短路操作符的示例
 * 
 * @author yinchu
 *
 */
public class ShortCircuitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 1;
		boolean flag = false;

		// 因为左边的表达式是true，所以执行了右边的表达式
		if ((flag == false) && (a++ > 1)) {
			System.out.println("Equal...");
		} else {
			System.out.println("Not equal...");
		}
		System.out.println(a);

		// 短路，并没有执行&&右边的表达式
		if ((flag = false) && (a++ > 1)) {
			System.out.println("Equal...");
		} else {
			System.out.println("Not equal...");
		}
		System.out.println(a);

		// 短路了，因为左边的表达式是true，所以没有执行了右边的表达式
		if ((flag == false) || (a++ > 1)) {
			System.out.println("Equal...");
		} else {
			System.out.println("Not equal...");
		}
		System.out.println(a);

		// 因为左边的表达式是false，所以执行了右边的表达式
		if ((flag = false) || (a++ > 1)) {
			System.out.println("Equal...");
		} else {
			System.out.println("Not equal...");
		}
		System.out.println(a);
	}

}
