package jdbc;
import java.sql.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///y","root","123456");
			Statement s=con.createStatement();
			String q="insert into w2(id,name) values (101,'ravi')";
			int i=s.executeUpdate(q);
			if (i>0) {
				System.out.println("Done");
			}
			else {
				System.out.println("not done");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	}


