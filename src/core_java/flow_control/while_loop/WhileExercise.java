package core_java.flow_control.while_loop;

public class WhileExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "baoyinchu";
		char[] nameArray = name.toCharArray();
		
		int index = 0;
		while(index < nameArray.length) {
			if(index == nameArray.length - 1) {
				System.out.print(nameArray[index]);
			}else {
				System.out.print(nameArray[index] + ", ");
			}
			index ++;
		}
	}

}
