package oops;

public class Cnstrctr {
	int a;
	int b;
	// public abstract  Cnstrctr() -error 
	 Cnstrctr()
	{
		a=10;
		b=20;
		System.out.println("default Constrctr");
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------------\n");
	}
	 
	 public Cnstrctr(int side)
		{
	
			System.out.println("area of sqr is : "+side*side);
			System.out.println("---------------\n");
		}

	 public Cnstrctr(int a,int b)
		{
		 this.a=a;
		 this.b=b;
		 
		 // will help to assign local vals to instance vars
			System.out.println("area of rect is : "+a*b);
			System.out.println("a  "+b+"   b "+b); 
			System.out.println("---------------\n");
		}
	 public Cnstrctr(double a,int b)
		{
			System.out.println("area of x is : "+a*b);
			System.out.println("---------------\n");
		}
	 public void display()
	 { 
		 this.a=a;
	 	this.b=b;
		 System.out.println("a  "+b+"   b "+b); 
	 }
// Parameterised Constrctr
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cnstrctr c=new Cnstrctr();
		Cnstrctr d=new Cnstrctr(20);
		Cnstrctr e=new Cnstrctr(207,2);
		Cnstrctr f=new Cnstrctr(20.22,2);
																												// obj bnra h & stored
		System.out.println("--------uj-----\n");
		e.display();
																												// 20,2 has not printd because tgy r locals in cnstrctr

																												// after putg this.a &.b -> will print & assign local val toinstance val
		
	}

}

																															// constrctr cant b - abstract static final syncronized
																												// cnstrctr can b private & can b more thn 1


																													//defalt cnstr
																													//prmtryzd c
																													// cnstrctr ovrlodg