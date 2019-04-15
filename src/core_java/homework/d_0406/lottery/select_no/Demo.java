package core_java.homework.d_0406.lottery.select_no;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] previousNums = new String[3];
		core_java.homework.d_0406.lottery.DoubleColorBall  ball = new core_java.homework.d_0406.lottery.DoubleColorBall();
		for(int i = 0; i< 3; i++) {
			String preNum = ball.getPreviousNum();
			System.out.println(preNum);
			previousNums[i] = preNum;
		}
		System.out.println("----------------------------");
		SelectNum sn = new core_java.homework.d_0406.lottery.select_no.DoubleColorBall();
		int[] hotNums = sn.selectNums(previousNums, 2, true);
		for(int a : hotNums) {
			System.out.println(a);
		}
	}

}
