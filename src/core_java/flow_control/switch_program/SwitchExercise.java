package core_java.flow_control.switch_program;

public class SwitchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score = 61;
		int grade = (int)(score / 10);
		switch(grade) {
		case 9:
			System.out.println("Grade A");
			break;
		
		case 8:
			System.out.println("Grade B");
			break;
			
		case 7:
			System.out.println("Grade C");
			break;
			
		case 6:
			System.out.println("Grade D");
			break;
		
		default:
			System.out.println("Grade E");
			break;
			
		}
	}

}
