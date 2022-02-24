package Practice;

public class ExcHndlig {
	
	public void input() //Member Func of class
	{
	int h=10;
	System.out.println("hy");
	int b=h/0;
	System.out.println("hlo");
	}
// try catch
public void output() //Member Func of class
{
System.out.println("Input Method");
}
	public static void main(String[] args) {
//		try {
//		int h=10;
//		System.out.println("hy");
//		int b=h/0;
//		System.out.println("hlo");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		// try block thro -> catch e object m store krega jo ki print hoega
//		System.out.println("hy");
//		}
		
		
		ExcHndlig obj=new ExcHndlig();
		obj.input();
		obj.output();
}
	}
//  jis mthod m exceptn aygi uske aage ka code ni chlega try m

// exeptn declaratn 
// public void input() throws exception

// throw