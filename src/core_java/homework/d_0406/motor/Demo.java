package core_java.homework.d_0406.motor;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriveTemplate dc = new DriveCar();
		dc.drive();
		
		System.out.println("------------------------华丽丽的分割线----------------------------");
		
		DriveTemplate dm = new DriveMotor();
		dm.drive();
	}

}
