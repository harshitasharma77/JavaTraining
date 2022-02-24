package Practice;

import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				//inbuilt class - forname is the static mthd | this clas is used to load the driver clas
				Connection con=DriverManager.getConnection("jdbc:mysql:///y","root","123456");
				//connection is intrface con is refrnc var| drivr clas
				//String query="create table stux(id int,name varchar(25))";
				// String query="insert into stux values(1,'aman')";
				String query="select * from stux";
				Statement s=con.createStatement(); // establishing connectn 
				// con is intrface & is sendg the sql qry to databas
				ResultSet rr=s.executeQuery(query);
				
				while(rr.next()) {
					System.out.println(rr.getInt(1)+"		"+rr.getString(2));
				}
				
//				int i=s.executeUpdate(query);
//				if(i>0) {
//					System.out.println("Record is inserted");
//				}
//				else {
//					System.out.println("record has not been insertd");
//				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}

//
//import packages
//load driver class
//establish the connection
// qry
//create statement
//execute the sql qry- executeUpdate(ddl|Dml -craete insert update deleete) -execute update return 
// 						the int val ie the no of rows tht got modified/ executeQuery
// 						execute qry returns  only booolean val(0 or 1) if operation successful or not
//process the result
// closing the connection



imppack loaddrivrclas esttcon q 