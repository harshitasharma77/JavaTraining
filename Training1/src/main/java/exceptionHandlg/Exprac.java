package exceptionHandlg;

public class Exprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, k;
		int[] u=new int[4];
		i = 8;
		j = 2;
		try
		{
		k = i / j;
		System.out.println("hy1");
		for(int p=0;p<=4;p++) {
			u[p]=p+1;
		}
		for(int y:u) {
			System.out.println(u[y]);
		}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e+"Cant devide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"CMax no is 4");
		}
		catch(Exception e)
		{
			System.out.println(e+"Exceptn e");
		}
		System.out.println("hy");
		}

}
