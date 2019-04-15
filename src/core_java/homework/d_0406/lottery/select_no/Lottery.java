package core_java.homework.d_0406.lottery.select_no;

public class Lottery {
	
	public int getMaxNo(int[] numTimes, Integer previousMax) {
		int max = -1;
		int maxIndex = -1;
		for(int i = 0; i < numTimes.length; i++) {
			
			if(previousMax == -1) {
				 if(numTimes[i] > max) {
					 max = numTimes[i];
					 maxIndex = i + 1;
				 }
			}else {
				 if(numTimes[i] > max && numTimes[i] < numTimes[previousMax-1]) {
					 max = numTimes[i];
					 maxIndex = i + 1;
				 }
			}
		}
		// System.out.println("max...else...=>"+maxIndex);
		return maxIndex;
	}
	
	public int getMinNo(int[] numTimes, Integer previousMin) {
		int min = 9999;
		int minIndex = -1;
		for(int i = 0; i < numTimes.length; i++) {
			 if(previousMin == 9999) {
				 if(numTimes[i] < min) {
					 min = numTimes[i];
					 minIndex = i + 1;
				 }
			}else {
				 if(numTimes[i] < min && numTimes[i] > previousMin) {
					 min = numTimes[i];
					 minIndex = i + 1;
				 }
			}
		}
		return minIndex;
	}
}
