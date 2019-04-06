package core_java.interface_pkg.first_interface;

public interface Handphone {
	
	public static final double SIZE = 4.7;
	
	String LOGO = "Apple"; //默认是static, final类型的
	
	void takePhoto(); //默认是public， abstract类型
	
	public abstract void asTv();
}
