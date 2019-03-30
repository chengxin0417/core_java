package core_java.flow_control.do_while_loop;

import java.util.Scanner;

public class DoWhileExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess = -1; // 记录用户输入的数字
		int count = 0; // 记录用户输入的次数

		int standard = (int) (Math.random() * 100 + 1);
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("请输入1-100之间的数字: ");
			guess = sc.nextInt();
			if (guess > standard) {
				System.out.println("对不起，太大了");
			} else if (guess < standard) {
				System.out.println("对不起，太小了");
			} else {
				System.out.println("恭喜，中奖了...");
			}
			count++;
		} while (standard != guess);
		 System.out.println("你猜测的数字是:" + standard + "猜测了" + count + "次");
		 sc.close();
	}

}
