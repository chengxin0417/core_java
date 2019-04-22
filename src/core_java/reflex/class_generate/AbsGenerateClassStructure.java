package core_java.reflex.class_generate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class AbsGenerateClassStructure {
	public static final String BREAK_LINE = "\r\n";
	public static final String TABLE = "\t";

	/**
	 * 获得类的属性
	 * 
	 * @param c
	 */
	public abstract String generateClassFields(Class c);

	/**
	 * 获得类的方法
	 * 
	 * @param c
	 */
	public abstract String generateClassMethods(Class c);

	/**
	 * 获得类的构造方法
	 * 
	 * @param c
	 */
	public abstract String generateClassConstructors(Class c);

	/**
	 * 类生成器入口
	 * 
	 * @param c
	 */
	public void printClass(Class c) {
		System.out.println("public class " + c.getSimpleName() + " {\r\n");
		System.out.println(generateClassFields(c));
		System.out.println(generateClassConstructors(c));
		System.out.println(generateClassMethods(c));
		System.out.println("}");
	}

	/**
	 * 获取属性方法修饰符，返回String
	 * 
	 * @param obj
	 * @return
	 */
	protected String getModifier(Object obj) {
		int m = -1;
		String modifier = "";
		if (obj instanceof Field) {
			obj = (Field) obj;
			modifier = getMofifierName(((Field) obj).getModifiers());
		}
		if (obj instanceof Method) {
			obj = (Method) obj;
			modifier = getMofifierName(((Method) obj).getModifiers());
		}

		if (obj instanceof Constructor) {
			obj = (Constructor) obj;
			modifier = getMofifierName(((Constructor) obj).getModifiers());
		}
		
		return modifier;
	}

	private String getMofifierName(int m) {
		String name = "";
		switch (m) {
		case 1:
			name = "public";
			break;
		case 2:
			name = "private";
			break;
		case 4:
			name = "protected";
			break;
		case 16:
			name = "final";
			break;
		case 8:
			name = "static";
			break;
		}

		return name;
	}

	/**
	 * 获取方法和构造方法的参数
	 * 
	 * @param obj
	 * @return
	 */
	protected String getMethodParams(Object obj) {
		StringBuffer sb = new StringBuffer();
		if (obj instanceof Method) {
			obj = (Method) obj;
			Class[] params = ((Method) obj).getParameterTypes();
			for (int i = 0; i < params.length; i++) {
				sb.append(params[i].getSimpleName()).append(" ").append("parameter_").append(i + 1);
				if(i != params.length-1) {
					sb.append(", ");
				}
			}
		}

		if (obj instanceof Constructor) {
			Class[] params = ((Constructor) obj).getParameterTypes();
			for (int i = 0; i < params.length; i++) {
				sb.append(params[i].getSimpleName()).append(" ").append("parameter_").append(i + 1);
				if(i != params.length-1) {
					sb.append(", ");
				}
			}
		}
		return sb.toString();
	}
}
