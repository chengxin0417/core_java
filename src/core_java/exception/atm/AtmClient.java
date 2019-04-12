package core_java.exception.atm;

public class AtmClient {

	public static void main(String[] args) throws AtmException {
		// TODO Auto-generated method stub
		Account account = new Account("000","张01", "100000", 80889.8);
		Atm atm = new AtmImpl(account);
		atm.service();
		
		Accounts.printExistedAccount();
	}

}
