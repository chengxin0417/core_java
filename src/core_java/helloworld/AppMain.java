package core_java.helloworld;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("张三"); //创建学生张三
		Student s2 = new Student("李四"); //创建学生李四

		s1.speak(); //学生张三说话
		s2.speak(); //学生李四说话
		
		String s[][] = new String[1][];
		s[0] = new String[2]; //为第一维分配存储空间，也就是定义第一维数组的长度
		s[1] = new String[3]; //为第二维分配存储空间，也就是定义第二维数组的长度
		s[0][0] = new String("my");
		s[0][1] = new String("name");
		s[1][0] = new String("is");
		s[1][1] = new String("Liu De Hua");
		s[1][2] = new String("!");
	}

}
