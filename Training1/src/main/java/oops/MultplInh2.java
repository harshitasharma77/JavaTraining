package oops;

interface AA1{
	int x = 20;// static final

	abstract void show();// abs pub
}

class A1 {
	public void show() {
		System.out.println("class A");
	}
}

interface BB1 {
	int x = 70;

	abstract void show();
}

class B extends A1 implements AA1, BB1 {
	public void show() {
		super.show();
		System.out.println("Showing");
		System.out.println(AA.x);
		System.out.println(BB.x);
	}
}

public class MultplInh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA1 a = new B();
		a.show();
	}

}
