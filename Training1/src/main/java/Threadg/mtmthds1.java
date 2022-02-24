package Threadg;
class A extends Thread{
	public void run() {
		System.out.println("Run mthd in clas A");
		for(int i=0;i<5;i++) {
			try {
			Thread.sleep(1000);
			}
			catch(Exception n) {
				System.out.println(n);
				//.printStackTrace();
			}
			System.out.println("Val of i in A"+i);
		}
	}
}
class B extends Thread{
	public void run() {
		System.out.println("Run mthd in clas B");
		for(int i=0;i<5;i++) {
			System.out.println("Val of k in B"+i);
		}
	}
}

public class mtmthds1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o=new A();
		B oo=new B();
		
		o.start();
		oo.start();
		
		oo.interrupt();
	}

}
//// stop
//suspend
//wait resume thread lifecycle intrrupt
//join pdf yeild()