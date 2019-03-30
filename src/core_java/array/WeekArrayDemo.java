package core_java.array;

import java.util.Arrays;

/**
 * 
 * @author yinchu
 * 课堂练习
 */
public class WeekArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weekArray = new int[7];
		//动态初始化
		weekArray[0] = 1;
		weekArray[1] = 2;
		weekArray[2] = 3;
		weekArray[3] = 4;
		weekArray[4] = 5;
		weekArray[5] = 6;
		weekArray[6] = 7;
		
		int[] weekendArray = new int[] {6,7};//静态初始化
		
		System.out.println(weekArray.length);
		System.out.println(weekendArray.length);
		
		System.out.println(Arrays.equals(weekArray, weekendArray));
		System.out.println(Arrays.binarySearch(weekArray, 3));
		
		
		int[] newArray = new int[2]; 
		System.arraycopy(weekendArray, 0, newArray, 0, 2);
		System.out.println(Arrays.equals(newArray, weekendArray));
		
	}

}
