package core_java.flow_control.if_program;

public class LeapYearApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2019;
		
		if(year%400==0||(year%4==0&&year%100!=0)) {
			System.out.println(year+"是闰年...");
		}else {
			System.out.println(year+"不是闰年...");
		}
	}

}
