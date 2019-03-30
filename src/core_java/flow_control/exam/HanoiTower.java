package core_java.flow_control.exam;

/**
 * 实现汉诺塔：一次只能移动一个盘子，不能把大盘子放在小盘子上；除了盘子移动的瞬间，
 * 盘子必须都在柱子上，也就是说不能把盘子放在柱子以外的地方。在这些要求下，把盘子从A柱搬到C柱
 * @author yinchu
 *
 */
public class HanoiTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerTool(3, 'A', 'B', 'C');
	}
	
	/**
	 * 
	 * @param n: 盘子的数量
	 * @param a：柱子A
	 * @param b：柱子B
	 * @param c：柱子C
	 */
	public static void towerTool(int n, char a, char b, char c) {
		if(n == 1) {
			System.out.println(a + " >> " + c);
		}else {
			towerTool(n-1, a,c,b);
			System.out.println(a + " >> " + c);
			towerTool(n-1, b,a,c);
		}
	}
	

}
