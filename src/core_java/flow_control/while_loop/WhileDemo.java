package core_java.flow_control.while_loop;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,2,5,6,8,9,9,0,2,3,0,4,5,6,77,99};
		
		int index = 0;
		while(index < array.length) {
			System.out.println(array[index]);
			index++;
		}
	}

}
