package core_java.modifier.final_modifier;

import java.util.Calendar;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(1992, 11, 1);
		Student s1 = new Student(c.getTime(), "张三", 27);
		
		s1.setAge(11);
	}

}
