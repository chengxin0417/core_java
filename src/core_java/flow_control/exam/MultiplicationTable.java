package core_java.flow_control.exam;

/**
 * 打印乘法表
 * @author yinchu
 *
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				if(i == j) {
					System.out.println(j + " * " + i + " = " + (i*j));
				}else {
					System.out.print(j + " * " + i + " = " + (i*j) + '\t');
				}
			}
		}
	}

}
