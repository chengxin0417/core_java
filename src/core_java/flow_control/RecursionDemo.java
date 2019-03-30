package core_java.flow_control;

/**
 * 用递归来求一个整数的阶乘
 * 
 * @author yinchu
 *
 */
public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(20));
	}

	public static long factorial(long num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}
