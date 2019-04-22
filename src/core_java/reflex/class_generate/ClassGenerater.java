package core_java.reflex.class_generate;

public class ClassGenerater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = String.class;
		Class c1 = Runnable.class;
		AbsGenerateClassStructure gcs = new GenerateClassStructureImpl();
		gcs.printClass(c);
	}

}
