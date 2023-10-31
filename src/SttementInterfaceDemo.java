import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SttementInterfaceDemo {

	static Statement st;
	static Connection cn;
	static ResultSet rs;
	static {
		cn = DBUtil.getConn();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static int addEmployee(Employee e) {
		int n = 0;
		try {

			String query = "INSERT INTO Employee VALUES(" + e.getEmployeeId() + ",'" + e.getName() + "'," + e.getSalary() + ")";

			n = st.executeUpdate(query);
		}
		catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return n;
	}
	
	public static void  getEmployee()
	{
		try {
			rs=st.executeQuery("select * from Employee");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(3));
			System.out.println();
			System.out.println("--------------------------------");
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public static int deleteEmployee(Employee emp) {
		int n = 0;
		try {

			String query="DELETE  FROM Employee where employeeId='" + emp.getEmployeeId() + "'";
			n=st.executeUpdate(query);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n ;
	}
}
