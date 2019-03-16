package core_java.variable;

public class VarInitial {
	public static boolean booleanVar;
	public static String stringVar;
	public VariableRange vr;
	public int intVar;
	char charVar = '*';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarInitial var = new VarInitial();
		System.out.println(booleanVar);
		System.out.println(stringVar);

		System.out.println(var.vr);
		System.out.println(var.intVar);
		System.out.println(var.charVar);
	}

}
