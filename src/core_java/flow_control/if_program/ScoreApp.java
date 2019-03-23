package core_java.flow_control.if_program;

public class ScoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float score = 59;
		if(score == 100) {
			System.out.println("完美，满分...");
		}else if(score >= 90) {
			System.out.println("非常不错，表现优秀...");
		}else if(score >=75) {
			System.out.println("还不错，表现良好...");
		}else if(score >= 60) {
			System.out.println("一般般，刚刚及格...");
		}else {
			System.out.println("太差劲了，都没及格...");
		}
	}

}
