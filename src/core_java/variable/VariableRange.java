package core_java.variable;

/**
 * 
 * @author yinchu
 * 变量的作用域例子
 */
public class VariableRange {
	int var1 = 0; //var1是成员变量
	
	public void method_1(int var2) { //var2是参数
		int var3 = 0; //var3是局部变量
		
		//下面是代码块
		if(var3 == 0) {
			int var4 = 0; //var4是在代码块中定义的局部变量
			var1++;
			var2++;
			var3++;
			var4++;
		}
	}
}
