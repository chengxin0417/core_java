package core_java.flow_control.do_while_loop;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,55,65,33,89,90,1,68,999,24,10001};
		
		int index = 0, index_1 = 1;
		do {
			if(array[index] < array[index_1]) {
				index = index_1;
			}
			index_1++;
		}while(index_1 < array.length) ;
		
		System.out.println(array[index]);
	}

}
