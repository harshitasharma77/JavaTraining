package Threadg;
class aaa1 implements Runnable {
	Runnable r=()-> {System.out.println("Thread is started");
	for (int i=9;i<14;i++) {
		System.out.println("val of [i1]  is "+i);

		try {
		Thread.sleep(500); // 2000-milisec - 2 sec | koi b thread 2 sec k baad chlega
		}
		catch(Exception e) {
			System.out.println("hy");
			e.printStackTrace();
		}
			}
	};
	public void run() {   	// 3. running state
//		System.out.println("Thread is started");
//		for (int i=9;i<14;i++) {
//			System.out.println("val of [i1]  is "+i);
//	
//			try {
//			Thread.sleep(500); // 2000-milisec - 2 sec | koi b thread 2 sec k baad chlega
//			}
//			catch(Exception e) {
//				System.out.println("hy");
//				e.printStackTrace();
//			}
//				}
		
	}
}
class bbb1 implements Runnable{
	public void run() {
		System.out.println("thread of b is started :");
		for (int i=0;i<4;i++) {
			System.out.println("val of [i__2] in bb class is "+i);
		}
	}
}
class ccc1 implements Runnable{
	public void run() {
		System.out.println("Thread in c is started");
		try {
			Thread.sleep(1000);
		}
		catch(Exception y) {
			y.printStackTrace();
		}
		for(int i=4;i<9;i++) {
			System.out.println("val of [i______3] in c is :"+i);
		}
	}
}


public class abc {
public static void main(String args[]) {
	aaa l=new aaa();		// 1. new born 
	bbb ll=new bbb();
	ccc lll=new ccc();
	
//	l.start(); // eror in runable because it is nt 
	//tread yet rathr we hav to first convert it into thread and thn use
	
	Thread t=new Thread(l);
	Thread tt=new Thread(ll);
	Thread ttt=new Thread(lll);
	
	t.start();
	tt.start();
	ttt.start();
}
}
// Stream ApI  (code reduces)- req: knowldg of interface(predicate ,consumer ...)-fnctionalInterface -
// if u hav good understanding of above - Labda Expression 
