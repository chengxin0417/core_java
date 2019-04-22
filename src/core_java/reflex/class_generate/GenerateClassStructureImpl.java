package core_java.reflex.class_generate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GenerateClassStructureImpl extends AbsGenerateClassStructure {

	@Override
	public String generateClassFields(Class c) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		Field[] fields = c.getFields();
		for (Field f : fields) {
			sb.append(TABLE).append(getModifier(f)) // 获得属性修饰符
					.append(" ").append(f.getType().getSimpleName()).append(" ") // 获得属性类型
					.append(f.getName()).append(";").append(BREAK_LINE).append(BREAK_LINE); // 获得属性名字
		}
		
		return sb.toString();
	}

	@Override
	public String generateClassMethods(Class c) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		Method[] methods = c.getMethods();
		for (Method m : methods) {
			sb.append(TABLE).append(getModifier(m)) // 获得方法修饰符
					.append(" ").append(m.getReturnType().getSimpleName()).append(" ") // 获得方法返回类型
					.append(m.getName()).append(" (").append(getMethodParams(m)).append(") {").append(BREAK_LINE) // 获得方法名字
					.append(TABLE).append("}").append(BREAK_LINE).append(BREAK_LINE);
		}
		return sb.toString();
	}

	@Override
	public String generateClassConstructors(Class c) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		Constructor[] cons = c.getConstructors();
		for (Constructor con : cons) {
			sb.append(TABLE).append(getModifier(con)).append(" ") // 获得构造方法修饰符
					.append(con.getDeclaringClass().getSimpleName()).append(" (").append(getMethodParams(con)).append(") {").append(BREAK_LINE) //获得构造方法名字
					.append(TABLE).append("}").append(BREAK_LINE).append(BREAK_LINE);
		}
		return sb.toString();
	}

}
