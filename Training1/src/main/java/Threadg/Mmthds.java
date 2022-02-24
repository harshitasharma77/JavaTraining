package Threadg;
class a extends Thread{
	public void run() {
		System.out.println("this is in A");
		for(int i=0;i<3;i++) {
			System.out.println("Thread A name is  "+Thread.currentThread().getName()+" value is "+i);
			try {
				Thread.sleep(90);
			}
			catch(Exception n) {
				System.out.println(n);
			}
		}
	}
}
class b extends Thread{
	public void run() {
		System.out.println("this is in B");
		for(int i=0;i<3;i++) {
			System.out.println("Thread B name is  "+Thread.currentThread().getName()+" value is "+i);
			try {
				Thread.sleep(90);
			}
			catch(Exception n) {
				System.out.println(n);
			}
		}
	}
}
public class Mmthds {
	public static void main(String []args) {
	a t=new a();
	t.start();

//	try {
//		t.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
	//t.yield();
	
	System.out.println("							t.currentThread()       :             "+t.currentThread());

	System.out.println("							t.currentThread().getName()    :         "+t.currentThread().getName());
	b t1=new b();
	t1.start();
	
//	a tt=new a();
//	tt.start();
//	b t11=new b();
//	t11.start();
}
}









// yld
// main[5,main,5]
// intrupt