package core_java.clone.deep;

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes cls_1 = new Classes("爱因斯坦B班", 8);
		Student s_1 = new Student("Jim", 8, cls_1);

		try {
			Student s_2 = (Student) s_1.clone();
			s_2.setName("Lucy");
			s_2.setAge(12);
			s_2.getClasses().setClassName("爱迪生A班");
			s_2.getClasses().setClassNo(2);
			
			
			System.out.println("测试s_1和s_2对象是不是同一个对象：" + (s_1 == s_2));
			System.out.println("打印s_1对象属性：" + s_1.toString());
			System.out.println("打印s_2对象属性：" + s_2.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
