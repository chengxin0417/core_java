package core_java.helloworld;

/**
 * 
 * @author yinchu
 *
 */
public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("张三"); //创建学生张三
		Student s2 = new Student("李四"); //创建学生李四

		s1.speak(); //学生张三说话
		s2.speak(); //学生李四说话
		
	}

}
