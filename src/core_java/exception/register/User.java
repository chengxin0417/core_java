package core_java.exception.register;

import java.sql.SQLException;

public class User {
	
	public void register() throws RegisterException {
		RegisterDAO dao = new RegisterDAO();
		try {
			dao.insertInformation();
		} catch (SQLException e) {
			RegisterException re = new RegisterException(e);
			throw re;
		}
	}
}
