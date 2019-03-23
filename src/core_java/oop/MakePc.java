package core_java.oop;

public class MakePc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpu cpu = new Cpu("a");
		Disk disk = new Disk("asus");
		Memory memory = new Memory("b");
		Computer pc = new Computer(cpu, memory, disk);
		pc.make();
	}

}
