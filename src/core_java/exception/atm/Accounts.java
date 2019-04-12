package core_java.exception.atm;

public class Accounts {
	public static Account[] EXISTED_ACCOUNT = new Account[] {
			new Account("001","张01", "100000", 1000000.8), new Account("002","张02", "100000", 1000000.8),
			new Account("003","张03", "100000", 1000000.8), new Account("005","张05", "100000", 1000000.8),
			new Account("004","张04", "100000", 1000000.8), new Account("006","张06", "100000", 1000000.8),
	};
	
	public static void printExistedAccount() {
		for(Account ac : EXISTED_ACCOUNT) {
			printSplitLine();
			System.out.println("账户姓名：" + ac.getName());
			System.out.println("账户账号：" + ac.getAcccountNo());
			System.out.println("账户余额：" + ac.getAmount());
			printSplitLine();
		}
	}
	
	public static void printSplitLine() {
		System.out.println("----------------------------------------------------------");
	}
}
