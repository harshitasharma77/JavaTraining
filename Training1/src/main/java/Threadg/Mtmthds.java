package Threadg;

public class Mtmthds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		System.out.println(t.currentThread());
		t.setName("MT");
		System.out.println(t.currentThread());
	}

}
