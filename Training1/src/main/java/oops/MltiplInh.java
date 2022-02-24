package oops;

interface AA{ 
	int x=20;//static final
	abstract void show();// abs pub
}

class A{
	public void show() {
		System.out.println("class A");
	}
}
interface BB{
	int x=70;
	abstract void show();
}


public class MltiplInh extends A implements AA,BB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MltiplInh m = new MltiplInh();
		m.show();
	}
	@Override
	public void show() {
		super.show();
		System.out.println("interface");
	}
	}