package oops;
class Bird{
	 int g;
	Bird(int g){
		this.g=g;
		System.out.println("This is bird"+g);
	}
	public void fly(int a,int b) {
		System.out.println("Birds can fly"+(a)+(b));
	}
}
class Eagle extends Bird{
	Eagle(){
		
		super(88);
		System.out.println("Eagle can walk"+super.g);
	}
	public void fly(int x) {
		super.fly(3,5);
		System.out.println("eagle can fly too"+x);
	}
}

public class MthdOvrridg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle e=new Eagle();
		e.fly(1);
		
	}

	
}
// super-parent clas
// super - to invoke parent clas (instance var,constrctr,mthd
// 