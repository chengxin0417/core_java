package core_java.oop;

public class Computer {

	private Cpu cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {

	}

	public Computer(Cpu cpu, Memory memory, Disk disk) {
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}

	public void make() {
		System.out.println("组装电脑...");
	}
}
