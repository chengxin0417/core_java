package core_java.exception.atm;

import java.util.Scanner;

public class AtmImpl implements Atm {

	private Account account;

	public AtmImpl() {

	}

	public AtmImpl(Account account) {
		this.account = account;
	}

	public void service() throws AtmException {
		boolean loginSucc = login();
		if (loginSucc) {
			while (true) {
				int i = selectMenu();
				switch (i) {
				case 1:
					withdrawal();
					break;
				case 2:
					deposit();
					break;
				case 3:
					transferAmount();
					break;
				case 4:
					query();
					break;
				case 5:
					exit();
					break;
				default:
					try {
						throw new AtmException("操作错误，请重新选择操作.");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						AtmException ae = new AtmException("操作错误，请重新选择操作。");
						ae.printStackTrace();
					}
				}
			}
		}
	}

	@Override
	public int selectMenu() throws AtmException {
		// TODO Auto-generated method stub
		int i = -1;
		System.out.println("请选择（只需要输入操作代号即可）：");
		System.out.println("1 - 取款");
		System.out.println("2 - 存款");
		System.out.println("3 - 转账");
		System.out.println("4 - 查询");
		System.out.println("5 - 退出");
		try {
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			if (i < 1 || i > 5) {
				throw new AtmException("操作错误，请重新选择操作.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			AtmException ae = new AtmException("操作错误，请重新选择操作。");
			e.printStackTrace();
		}
		Accounts.printSplitLine();
		return i;
	}

	/**
	 * 登录
	 * 
	 * @return
	 * @throws AtmException
	 */
	public boolean login() throws AtmException {
		int tryCount = 1;
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("请输入密码（密码为6位数字）： ");
				Scanner sc = new Scanner(System.in);
				String password = sc.nextLine();
				if (this.account.getPassword().equals(password)) {
					return true;
				} else {
					if (tryCount == PASSWORD_MAX_TRY_COUNT) {
						throw new AtmException("密码输入超过三次, 该卡已经被ATM机器回收，请联系该行客服人员。");
					}
					System.out.println("密码输入错误，请重新输入（密码输入错误超过三次，该卡将被ATM没收） ");
					tryCount++;
				}
			}
		} catch (AtmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		return false;
	}

	/**
	 * 取款
	 */
	@Override
	public void withdrawal() throws AtmException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amountAsInt = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("请输入取款金额（只能是50或者100的倍数，单次最大存款不超过2000元）：");
			try {
				String amountAsStr = sc.nextLine();
				amountAsInt = Integer.parseInt(amountAsStr);
				if (amountAsStr == null || "".equals(amountAsStr) || amountAsStr.contains(".") || amountAsInt % 50 != 0) {
					throw new AtmException("只能是50或者100的倍数，请重新输入.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				AtmException ae = (AtmException) e;
				ae.printStackTrace();
				continue;
			}
			try {
				if (amountAsInt > 2000) {
					throw new AtmException("单次最大取款不超过2000元。");
				}
				if (amountAsInt > account.getAmount()) {
					throw new AtmException("余额不足");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				AtmException ae = (AtmException) e;
				ae.printStackTrace();
				continue;
			}
			System.out.println("确认取款请按确认键，返回上级菜单请按返回键：");
			sc = new Scanner(System.in);
			String confirm = sc.nextLine();
			if(Atm.YES.equals(confirm)) {
				account.setAmount(account.getAmount() - amountAsInt);
				System.out.println("取款成功，当前账户可用余额为" + account.getAmount());
				Accounts.printSplitLine();
				flag = false;
			}else {
				break;
			}
		}
	}

	/**
	 * 转账
	 */
	@Override
	public void transferAmount() throws AtmException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			try {
				System.out.println("请输入对方账号：");
				String desAccountNo = sc.nextLine();
				boolean desAccountNoCorrect = false;
				Account desAccount = new Account();
				for (Account ac : Accounts.EXISTED_ACCOUNT) {
					if (desAccountNo.equals(ac.getAcccountNo())) {
						desAccountNoCorrect = true;
						desAccount = ac;
						break;
					}
				}
				System.out.println("请输入转账金额（单日最大转账金额不超过500000元）：");
				double transferAmount = sc.nextDouble();
				if(transferAmount > 50000) {
					System.out.println("单日最大转账金额不超过500000元，请重新输入转账金额。");
				}
				if (desAccountNoCorrect) {
					System.out.println("请确认要向以下账户转账人民币" + transferAmount + "吗？确认请按确认键，取消请按返回键: ");
					System.out.println("账户：" + desAccount.getAcccountNo());
					System.out.println("姓名：" + desAccount.getName());
				}else {
					throw new AtmException("对方账户不存在，请重新输入.");
				}
				sc = new Scanner(System.in);
				String confirm = sc.nextLine();
				if(YES.equals(confirm) ) {
					if(this.account.getAmount() > transferAmount) {
						account.setAmount(account.getAmount() - transferAmount);
						desAccount.setAmount(desAccount.getAmount() + transferAmount);
						System.out.println("转账成功，当前账户可用余额为" + account.getAmount());
						//测试转账是否成功
						Accounts.printSplitLine();
						Accounts.printExistedAccount();
					}
				}else {
					break;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				AtmException ae = (AtmException) e;
				ae.printStackTrace();
				continue;
			}
			flag = false;
		}
		Accounts.printSplitLine();
	}

	/**
	 * 存款
	 */
	@Override
	public void deposit() throws AtmException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amountAsInt = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("请输入存款金额（只能是50或者100的倍数，单次最大存款不超过10000元）：");
			try {
				String amountAsStr = sc.nextLine();
				amountAsInt = Integer.parseInt(amountAsStr);
				if (amountAsStr == null || "".equals(amountAsStr) || amountAsStr.contains(".") || amountAsInt % 50 != 0) {
					throw new AtmException("只能是50或者100的倍数，请重新输入.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				AtmException ae = (AtmException) e;
				ae.printStackTrace();
				continue;
			}
			try {
				if (amountAsInt > 10000) {
					throw new AtmException("单次最大存款不超过10000元.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				AtmException ae = (AtmException) e;
				ae.printStackTrace();
				continue;
			}
			flag = false;
		}
		account.setAmount(amountAsInt + account.getAmount());
		System.out.println("存款成功，当前账户可用余额为" + account.getAmount());
		Accounts.printSplitLine();
	}

	@Override
	public void query() throws AtmException {
		// TODO Auto-generated method stub
		System.out.println("当前账户余额为：" + account.getAmount());
		Accounts.printSplitLine();
	}

	/**
	 * 退出操作
	 */
	@Override
	public void exit() throws AtmException {
		// TODO Auto-generated method stub
		System.out.println("请拿走您的卡。");
		Accounts.printSplitLine();
		System.exit(0);
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
