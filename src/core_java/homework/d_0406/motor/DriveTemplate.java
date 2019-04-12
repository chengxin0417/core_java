package core_java.homework.d_0406.motor;

public abstract class DriveTemplate {
	
	public final void drive() {
		openDoor();
		setupGear();
		startEngine();
		run();
		brake();
		stop();
	 
	}
	
	public abstract void openDoor(); //开车门
	
	public abstract void setupGear(); //挂挡
	
	/**
	 * 点火启动引擎
	 */
	public void startEngine() {
		System.out.println("点火，启动发动机...");
	}
	
	/**
	 * 车子行驶中
	 */
	public void run() {
		System.out.println("车子行驶中...");
	}
	
	public abstract void brake(); //刹车
	
	/**
	 * 停车
	 */
	public void stop() {
		
	}
	
}
