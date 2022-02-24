package Practice;
//5

public class pth {
	public static int division(int a,int b)throws ArithmeticException {
		int g=a/b;
		return g;
	}
	public static void main(String[] args) {
		try {
			division(4,0);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
