package core_java.homework.d_0406.lottery;

public class DoubleColorBall extends Lottery{
	
	public void printLotteryNo() {
		// TODO Auto-generated method stub
		int[] preFixNums = generateNumber(33, 6);
		int[] suffixNums = generateNumber(16, 1);
		System.out.println("本期双色球开奖号码红球是：" + printNums(preFixNums));
		System.out.println("本期双色球开奖号码蓝球是：" + printNums(suffixNums));
	}
	
	public String getPreviousNum() {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer(printNums(generateNumber(33, 6), sb));
		sb.append(",");
		String str = printNums(generateNumber(16, 1), sb);
		return str;
	}
}
