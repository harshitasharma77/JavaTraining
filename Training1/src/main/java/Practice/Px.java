package Practice;
import java.sql.*;

public class Px {
	
	public static void main(String[] args) {
try {
	Class.forName("");
	Connection con = DriverManager.getConnection("jdbc:mysql:///y","root","123456");
	Statement x=con.createStatement();
	String g="Insert into t1(1,'aa')";
	int i=x.executeUpdate(g);
	if (i>0){
		System.out.println("done");
	}
	else {
		System.out.println("not done");
	}
	
}


}
