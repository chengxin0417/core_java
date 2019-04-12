package core_java.exception.atm;

public interface Atm {

	public static final int PASSWORD_MAX_TRY_COUNT = 3;
	public static final String YES = "确认";
	public static final String NO = "返回";

	public boolean login() throws AtmException; // 账号登录

	public void withdrawal() throws AtmException; // 取款

	public void transferAmount() throws AtmException; // 转账

	public void deposit() throws AtmException; // 存款
	
	public void query() throws AtmException; // 查询余额
	
	public void exit() throws AtmException; // 退出
	
	public void service() throws AtmException; //ATM入口
	
	public int selectMenu() throws AtmException; //菜单选择
}
