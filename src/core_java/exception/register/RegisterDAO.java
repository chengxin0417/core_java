package core_java.exception.register;

import java.sql.SQLException;

public class RegisterDAO {
	
	public void insertInformation() throws SQLException {
		throw new SQLException("往数据库插入注册信息的时候发生错误...");
	}
}
