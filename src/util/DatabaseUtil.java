package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() {
		try {
			//DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
			String dbURL = "jdbc:mysql://127.0.0.1:3307/caramidb?characterEncoding=UTF-8&serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "lhj0811";
			//static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
			//static final String URL="jdbc:mysql://127.0.0.1:3307/caramidb?serverTimezone=UTC";
			//static final String USER = "carami";
			//static final String PASSWORD = "lhj0811";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
