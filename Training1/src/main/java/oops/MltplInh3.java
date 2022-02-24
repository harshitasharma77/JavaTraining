package oops;
interface Engine{
	int a=33;
	public abstract void speed();
    static void bike()
	{
		System.out.println("hi");
	}
    public static void display() {
    	System.out.println("display  mthd Engine");
    }
    
    public default void display2() { 															// 1.8 onwards default,static  1.functional,Predicate,Supplier,Consumer
    	System.out.println("display mthd ");
    }
    public static void show() {
    	System.out.println("show mthd ");
    }
}

interface Engine1 {
	int a=44;
	public abstract void speed();
}

class car{
	public void look() {
		System.out.println("looking good");
	}
}
public class MltplInh3  extends car implements Engine,Engine1{
		public void display() {
			System.out.println("This is display in main");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MltplInh3 o=new MltplInh3();
		o.speed();
		o.look();
		 o.display();
		 Engine.display();
	}
	public void speed() {
		System.out.println(" Speed mthd implemented in main mthd ");
		System.out.println(" Val of intrface 1 : "+Engine.a);
		System.out.println(" Val of intrface 2 : "+Engine1.a);
        Engine.bike();
       
	}
}
// cant ovrride static mthd but can override default 