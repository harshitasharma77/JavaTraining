package jdbc;
import java.sql.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con =DriverManager.getConnection("Jdbc:mysql:///y","root","123456");
		 Statement ss = con.createStatement();
		 String qq = "select id,name from w1";
		 ResultSet rr=ss.executeQuery(qq);
		 while(rr.next()) {
			 System.out.println("ID : "+rr.getInt(1)+"----"+"Name " +rr.getString(2));
		 }
		}
		catch(Exception e){
			System.out.println();
		}
	}

}
