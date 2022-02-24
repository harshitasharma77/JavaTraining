package exceptionHandlg;

public class Eh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		if (age<18) {
			//throw new Exception e;
			Exception e=new Exception();
			throw e;
		}
		else {
			System.out.println("you are above 18");
		}
		catch(Exception e1) {
			System.out.println(e1.printStackTrace());
		}
	}
// try apne ap thro krta h
	
}
