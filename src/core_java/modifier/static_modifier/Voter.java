package core_java.modifier.static_modifier;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 模拟投票活动，每个人只能投一票，当投票总数达到100时，就停止投票
 * 
 * @author yinchu
 *
 */
public class Voter {

	public static final int MAX_COUNT = 100; // 最大投票数
	private static int count; // 记录投票数
	private static Set<Voter> voters = new HashSet<Voter>(); // 存放所有已经投票的选民
	private String name; // 投票人的姓名

	public Voter() {

	}

	public Voter(String name) {
		this.name = name;
	}

	public void vote() {
		if (count == MAX_COUNT) {
			System.out.println("对不起，您来晚了，投票活动已经结束...");
		} else if (hasVoted(this)) {
			System.out.println("对不起，您已经投票了，不能重复投票...");
		} else {
			count++;
			voters.add(this);
			System.out.println(name + ", 感谢您投票...");
		}
	}

	/**
	 * 查看当前投票的人是否已经投票
	 * 
	 * @param voter
	 * @return: false：没有投票；true：已经投票
	 */
	private boolean hasVoted(Voter voter) {
		if (voters.contains(voter)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voter other = (Voter) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
