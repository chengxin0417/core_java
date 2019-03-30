package core_java.homework.d_0324;

import java.util.Scanner;

public class CounterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入数字：");
		Scanner sc1 = new Scanner(System.in);
		String num_1 = sc1.nextLine();

		System.out.print("请输入操作符：");
		Scanner sc2 = new Scanner(System.in);
		String operator = sc2.nextLine();

		System.out.print("请输入数字：");
		Scanner sc3 = new Scanner(System.in);
		String num_2 = sc3.nextLine();

		BasicCounter bc = null;
		if ("+".equals(operator)) {
			bc = new AddCounter();
		} else if ("-".equals(operator)) {
			bc = new SubtractCounter();
		} else if ("*".equals(operator)) {
			bc = new MultiplyCounter();
		} else if ("/".equals(operator)) {
			if ("0".equals(num_2)) {
				System.err.println("错误提示：除法分母不能为0...");
			} else {
				bc = new DivisionCounter();
			}
		} else {
			System.err.println("错误提示：您输入的操作法是非法的...");
		}

		if (bc != null) {
			System.out.println(
					"(" + num_1 + ") " + operator + " (" + num_2 + ")" + "的计算结果是: " + bc.processNumber(num_1, num_2));
		}

		sc1.close();
		sc2.close();
		sc3.close();
	}

}
