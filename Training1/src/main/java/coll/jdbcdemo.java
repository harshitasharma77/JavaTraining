package coll;
import java.sql.*;
public class jdbcdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///dbname","root","123456");
			//String query="create table stux(id int,name varchar(25))";
			String query="insert into stu"
			Statement s=con.createStatement();
			s.executeUpdate(query);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
