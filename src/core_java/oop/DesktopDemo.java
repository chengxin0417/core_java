package core_java.oop;

public class DesktopDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p = new Battery();
		
		
		Desktop dp = new Desktop(p);
		dp.work();
	}

}
