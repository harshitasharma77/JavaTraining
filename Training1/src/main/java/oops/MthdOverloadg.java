package oops;

class Adder{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
class Adder1{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b ) {
		return a+b;
	}
}
public class MthdOverloadg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11,11,11));
		System.out.println(Adder1.add(11,11));
		System.out.println(Adder1.add(113.33,11.39));
	}

}
