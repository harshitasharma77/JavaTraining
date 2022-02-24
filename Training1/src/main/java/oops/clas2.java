package oops;

class test1 {
	int a = 99; 																					// instance var -> clas k andr &methd k bhr
	int c;
	int b;
	static String learnerName;

	public void input() {
		int jj;

		a = 9;
		b = 10;
	}

	public void output() {
		System.out.println("val of a = " + a);
		System.out.println("val of b = " + b);
	}

	@Override
	public String toString() {
		return "test [a=" + a + ", b=" + b + "]";
	}
}

public class clas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test.learnerName="uu";
		int g; 
		test1 o1=new test1(); //new-heap mmry
		System.out.println("o1  "+o1);
		o1.input();
		
		
		o1.learnerName="hh";
		System.out.println("o1  "+o1);
		System.out.println(o1.hashCode());
		o1.output();
		
		test1 o2=new test1();
		System.out.println(o2);
		o2.output();
		o2.a=99;
		o2.b=88;
		System.out.println(o2);
		o2.output();
		System.out.println(o2.learnerName); //common memory
		System.out.println(o2.c);
		// System.out.println(o2.jj);
		System.out.println(o2.hashCode());
	}
	

	static {
		System.out.println("This is my static block");
	}

}


// state-data, behavr- member func,identity-hashcode(id)
// static -fnct,nested clas,block
