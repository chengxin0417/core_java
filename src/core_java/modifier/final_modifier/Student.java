package core_java.modifier.final_modifier;

import java.util.Date;

public class Student {
	public static final int MAX_AGE = 18; // 静态常量
	public static final int MIN_AGE = 8; // 静态常量
	private final Date birthday; // 实例常量，通常学生的出生日期是不能更改，所以设置为常量。

	private String name;
	private int age;

	public Student(Date birthday, String name, int age) {
		this.name = name;
		if (age > MAX_AGE || age < MIN_AGE) {
			System.out.println("该学生年龄不符合入学要求...");
		} else {
			this.age = age;
		}
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

}
