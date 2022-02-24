package exceptionHandlg;

public class Ep1 {
	public void input()
	{
	System.out.println("hy");
	int a=0;
	int b=90/0;
	
	//System.out.println("kk");
	
	
	}
	public void output()
	{
		System.out.println("Outpt mthd");
	}
	public static void main(String args[])
	
	{
		Ep obj=new Ep();
		try
		{
		obj.input();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		obj.output();
	}

}
