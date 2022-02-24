	package Threadg;

class aa extends Thread{
	public void run() {   	// 3. running state
		System.out.println("Thread is started");
		for (int i=9;i<14;i++) {
			System.out.println("val of [i1]  is "+i+"a");
			try {
			Thread.sleep(2000); // 2000-milisec - 2 sec | koi b thread 2 sec k baad chlega
			} // Thread mthd 
			catch(Exception e) {
				System.out.println("hy");
				e.printStackTrace();
			}
		}
	}
}
class bb extends Thread{
	public void run() {
		System.out.println("thread of b is started :");
		for (int i=0;i<4;i++) {
			System.out.println("val of [i__2] in bb class is "+i+"b");
		}
	}
}
class cc extends Thread{
	public void run() {
		System.out.println("Thread in c is started");
		for(int i=4;i<9;i++) {
			System.out.println("val of [i______3] in c is :"+i+"c");
		}
	}
}
public class Mltithrdg {

	public static void main(String []args) {
		aa l=new aa();		// 1. new born 
		bb ll=new bb();
		cc lll=new cc();
		
		l.start();  // 2. runnable stat - waiting state // control will go to run mthd
		ll.start();
		lll.start();
//		aa.run();
//		bb.run();
//		cc.run();
	}
}

// only 1 interface - functional interface
//runnable interface is implemented in thread class & run is methd in runnable

// We can implement Thread in java using  2 mthds:
// 1. Extending the Thread class 
// 2. Implementing Runnabe Interface


// .start() lagaane k bad they will go to runnabkle state thn will find run mthd 
// block state m jayga if it got slept

//intrupt mthd - throws intrupted exception
// works if ur thd is working in waitg or running state
// sleep mthd execution m aane p... agr intrupyt mthd use ho to exceptn[SleepIintrupt 


// intrupt mthd tb execute hga jb thread sleeep ya watg m jayga
// yeild mthd - pauses the current executg thread & give control to oothr thred