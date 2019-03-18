package core_java.operation;

/**
 * 三元操作符?:代码示例
 * 
 * @author yinchu
 *
 */
public class TernaryOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 81;
		String level = score > 80 ? "优秀" : "不优秀";
		System.out.println("我的成绩" + level);
		
		if(score > 80) {
			System.out.println("我的成绩优秀");
		}else {
			System.out.println("我的成绩不优秀");
		}
	}

}
