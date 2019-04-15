package core_java.homework.d_0406.lottery.select_no;

public class DoubleColorBall extends Lottery implements SelectNum {

	@Override
	public int[] selectNums(String[] previousLotteryNums, int count, boolean isHot) {
		// TODO Auto-generated method stub
		int[] selectedNums = new int[count];
		int[] numTimes = new int[33];
		for (String str : previousLotteryNums) {
			String[] numsAsStr = str.split(",");
			for (String numAsStr : numsAsStr) {
				int num = Integer.valueOf(numAsStr);
				numTimes[num-1]++;
			}
		}

		int max = -1;
		int min = 9999;

		for (int i = 0; i < count; i++) {
			if (isHot) {
				max = getMaxNo(numTimes, max);
				selectedNums[i] = max;
			} else {
				min = getMinNo(numTimes, min);
				selectedNums[i] = min;
			}
		}

		return selectedNums;
	}

}
