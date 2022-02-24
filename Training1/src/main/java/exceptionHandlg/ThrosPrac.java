package exceptionHandlg;

//public class ThrosPrac {
	 class UserD extends Exception{
		 public UserD (String msg) {
			 super(msg);
		 } 
	 }
	 
	  class ThrosPrac
	 {
		 public static void checkAge(int age)throws UserD
		 {
			 if (age<18) {
				 throw new UserD("gusdfghjhi j");
			 }
			 else 
			 {
				 System.out.println("Valid !");
			 }
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			checkAge(8);
		}
		catch(UserD e)
		{
			System.out.println("exception "+e);
		}
		

	
}}