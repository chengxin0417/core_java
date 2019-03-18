package core_java.operation;

/**
 * 一元操作符代码示例
 * 
 * @author yinchu
 *
 */
public class UnitaryOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10, j = 10, k = 10, l = 10, m = 10, n = 10;
		System.out.println("i  " + "j  " + "k  " + "l  " + "m  " + "n  ");
		System.out.println(i + " " + j + " " + k + " " + l + " " + m + " " + n);
		j++;// j+1
		i--;// i-1
		m = ~k;// 把k逐位取反的值赋给m
		n = -l;// 把变量l取反后的值赋给n
		System.out.println(i + " " + j + " " + k + " " + l + " " + m + " " + n);
	}

}
