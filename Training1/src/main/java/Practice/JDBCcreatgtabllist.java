package Practice;
import java.sql.*;

public class JDBCcreatgtabllist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///y","root","123456");
			
			Statement s=con.createStatement();
			String q="create table x(id int ,name varchar(20))";
			s.executeUpdate(q);
		}
		catch(Exception e ) {
			e.printStackTrace();
			
		}
		
	}

}
