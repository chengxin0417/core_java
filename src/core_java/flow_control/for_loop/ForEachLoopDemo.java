package core_java.flow_control.for_loop;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,2,5,6,8,9,9,0,2,3,0,4,5,6,77,99};
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == 1000) {continue;}
			System.out.println(array[i]);
			
			
		}
	}

}
