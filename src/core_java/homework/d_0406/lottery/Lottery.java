package core_java.homework.d_0406.lottery;

import java.util.Arrays;

/**
 * 抽奖程序父类
 * @author yinchu
 *
 */
public abstract class Lottery {
	
	public int[] generateNumber(int max, int count) {
		int[] nums = new int[count];
		int i = 0;
		while(i != count) {
			int num = (int)(Math.random()*max ) + 1;
			if(checkExistedNum(num, nums)) {
				nums[i] = num;
				i++;
			}
		}
		Arrays.sort(nums);
		return nums;
	}
	
	public abstract void printLotteryNo();
	
	public String printNums(int[] nums) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length-1) {
				sb.append(nums[i]);
			}else {
				sb.append(nums[i]).append(",");
			}
		}
		return sb.toString();
	}
	
	private boolean checkExistedNum(int number, int[] nums) {
		for(int num : nums) {
			if(num == number) {
				return false;
			}
		}
		return true;
	}
}
