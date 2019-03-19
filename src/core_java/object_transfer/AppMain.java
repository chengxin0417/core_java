package core_java.object_transfer;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FatcherClass f = new FatcherClass();
		ChildClass c = new ChildClass();
		
		FatcherClass f_1 = c;
		ChildClass c_1 = (ChildClass) f;
		
	}

}
