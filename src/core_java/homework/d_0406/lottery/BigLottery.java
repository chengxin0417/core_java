package core_java.homework.d_0406.lottery;

public class BigLottery extends Lottery {

	@Override
	public void printLotteryNo() {
		// TODO Auto-generated method stub
		int[] prefixNums = generateNumber(35, 5);
		int[] suffixNums = generateNumber(12, 2);
		System.out.println("本期大乐透前区号码是：" + printNums(prefixNums));
		System.out.println("本期大乐透后区号码是：" + printNums(suffixNums));
	}

}
