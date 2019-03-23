package core_java.oop;

public class Desktop {
	private Power power;

	public Desktop() {

	}

	public Desktop(Power power) {
		this.power = power;
	}

	public void work() {
		// System.out.println("笔记本工作...");
		power.providePower();
	}
}
