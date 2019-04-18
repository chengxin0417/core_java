package core_java.homework.d_0406;

import java.util.Random;

public class Temp {
	
	private static Random rand = new Random();
	private final int a1 = new Random().nextInt(10);
	private static final int a2 = new Random().nextInt(10);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t1 = new Temp();
		System.out.println("t1.a1 = "+ t1.a1);
		System.out.println("t1.a2 = "+ t1.a2);
		
		Temp t2 = new Temp();
		System.out.println("t2.a1 = "+ t2.a1);
		System.out.println("t2.a2 = "+ t2.a2);
		
	}

}
