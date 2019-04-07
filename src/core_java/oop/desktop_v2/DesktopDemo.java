package core_java.oop.desktop_v2;

public class DesktopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p = new Battery();
		
		
		Desktop dp = new Desktop(p);
		dp.work();
	}

}
