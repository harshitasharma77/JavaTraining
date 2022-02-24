package exceptionHandlg;

public class Ep {
	
		public void input()
		{
		System.out.println("hy");
		try {
		int a=0;
		int b=90/0;
		}
		//System.out.println("kk");
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		public void output()
		{
			System.out.println("Outpt mthd");
		}
		public static void main(String args[])
		
		{
			Ep obj=new Ep();
			obj.input();
			obj.output();
	}

}
