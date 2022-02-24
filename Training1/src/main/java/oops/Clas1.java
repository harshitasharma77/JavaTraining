package oops;
class test{
																											// public protected private default
	int a =99; 																								//instance var -> clas k andr &methd k bhr
	int c;
	int b;
	static String learnerName;
																											//instance var can b used without initialising but with object
	
	public void input() {																					// member fnc
		int jj;
																						// System.out.println(f); //local var hav to be initialized
		 a=9;
		 b=10;
	}
	public void output() {
		System.out.println("val of a = "+a);
		System.out.println("val of b = "+b);
	}
	@Override
	public String toString() {
		return "test [a=" + a + ", b=" + b + "]";
	}
	
																										// itself will call the toString methd if exist - test [a=0, b=0] 
																										//else obj  will return the adddres of the obj - oops.test@626b2d4a
																									
																										//java8features - lambda expression
	}

public class Clas1 {

	public static void main(String[] args) {
		
		test.learnerName="uu";
		int g;																								 // local var - hav to be initialized
																										// System.out.println(g); - error
		
		test o1=new test(); //new-heap mmry
		System.out.println("o1  "+o1);
		o1.input();
		
		// static can be declared as below
		o1.learnerName="hh";
		System.out.println("o1  "+o1);
		System.out.println(o1.hashCode());
		o1.output();
		
		test o2=new test();
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

}






// obj contain - state behvr,idntity

// pri - clas k andr
// pub - anywhere
// default - may b same clas or diff clas bt in sme pckg
// pro -child var k thru khi b in package | outpckg


// static & hash code

// in static mthd we only can use static vars
// static var share common memory amng all the obj
// no need of obj can drctly acces with clas name


