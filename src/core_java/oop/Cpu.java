package core_java.oop;

public class Cpu {
	private String mf;
	
	public Cpu() {
		
	}
	
	public Cpu(String mf) {
		this.mf = mf;
	}
	
	public void make() {
		System.out.println("我是CPU...");
	}
}
