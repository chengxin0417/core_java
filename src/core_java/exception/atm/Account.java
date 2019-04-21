package core_java.exception.atm;

/**
 * ATM模拟程序之账户类
 * 
 * @author yinchu
 *
 */
public class Account {

	private String acccountNo;// 卡号
	private String name;// 名字
	private String password;// 密码
	private double amount;// 余额

	public Account() {

	}

	public Account(String acccountNo, String name, String password, double amount) {
		this.acccountNo = acccountNo;
		this.name = name;
		this.password = password;
		this.amount = amount;
	}

	public String getAcccountNo() {
		return acccountNo;	
	}

	public void setAcccountNo(String acccountNo) {
		this.acccountNo = acccountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acccountNo == null) ? 0 : acccountNo.hashCode());
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
		Account other = (Account) obj;
		if (acccountNo == null) {
			if (other.acccountNo != null)
				return false;
		} else if (!acccountNo.equals(other.acccountNo))
			return false;
		return true;
	}

	
}
