package core_java.variable;

public class StaticVarClient {
	
	public static int i;
	public int k;
	
	public StaticVarClient() {
		i = 4;
		k = 4;
	}
	
	public StaticVarClient(int j) {
		i = j;
		k = j;
	}

	public static void main(String[] args) {
		System.out.println(StaticVarClient.i);
		// TODO Auto-generated method stub
		StaticVarClient sv1 = new StaticVarClient();
		System.out.println(sv1.i);
		StaticVarClient sv2 = new StaticVarClient(99);
		
		System.out.println(sv1.i);
		System.out.println(sv2.i);
		
		System.out.println(sv1.k);
		System.out.println(sv2.k);
		
	}

}
