import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection cn;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/greet";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="password";
	
	public static Connection getConn() {
		try {
			Class.forName(DB_DRIVER_CLASS);// to load database driver
			System.out.println("Driver loaded successfully....");
            cn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            System.out.println("Connection established successfully....");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Error....." + e.getMessage());
		}
		return cn;
	}

}
