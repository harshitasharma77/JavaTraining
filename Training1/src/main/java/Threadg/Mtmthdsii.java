package Threadg;
class aamt extends Thread{
	public void run() {
		System.out.println("this is in A");
		for(int i=0;i<3;i++) {
			System.out.println("Thread A name is  "+Thread.currentThread().getName()+" value is "+i);
			try {
				Thread.sleep(900);
			}
			catch(Exception n) {
				System.out.println(n);
			}
		}
	}
}
class bbmt extends Thread{
	public void run() {
		System.out.println("this is in B");
		for(int i=0;i<3;i++) {
			System.out.println("Thread B name is "+Thread.currentThread().getName()+" value is "+i+"Priority iis "+Thread.currentThread().getPriority()+" "+Thread.currentThread());
			
		}
	}
}
public class Mtmthdsii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aamt tt=  new aamt();
		tt.start();
		tt.interrupt();
		
			bbmt t=new bbmt();
			t.setPriority(Thread.MAX_PRIORITY);
			t.setName("yy");
			t.setPriority(Thread.NORM_PRIORITY);
			t.start();
			
			
			
	}

}
//when using priority it donot gives garante as it just request the scheduling algo.. it tries but dont garantee
// solutn- 1. join method(Lock)
//2net banking; ticket processing
// Multithrdg adv- shared(Distributed system m kse work hga)
/* shared resourc - synchronizatn