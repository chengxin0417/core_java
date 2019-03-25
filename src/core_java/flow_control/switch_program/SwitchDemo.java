package core_java.flow_control.switch_program;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'X';
		switch(grade) {
		case 'A':
			System.out.println("Grade A range is 85 - 100");
			break;
		
		case 'B':
			System.out.println("Grade B range is 70 - 84");
			break;
			
		case 'C':
			System.out.println("Grade C range is 60 - 69");
			break;
			
		case 'D':
			System.out.println("Grade D range is less than 60");
			break;
		
		default:
			System.out.println("Invalid Grade...");
			break;
			
		}
	}

}
