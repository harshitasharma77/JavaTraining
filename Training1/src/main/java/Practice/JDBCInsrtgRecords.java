package Practice;
import java.sql.*;

public class JDBCInsrtgRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///demo","root","123456");
			Statement s=con.createStatement();
			String q="insert into x(id,name) values (101,'ravi')";
			int i=s.executeUpdate(q);
			if (i>0) {
				
				
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
