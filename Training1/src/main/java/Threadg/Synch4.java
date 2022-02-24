package Threadg;
class ax extends Thread{
	int t=0;
	public void run() {
		synchronized(this){
			for (int i=0;i<5;i++) {
				
				t=t+10;
				System.out.println(t);
			}
				this.notify();
	}
}
}

public class Synch4 {
	 

	public static void main(String[] args) {
		
		ax a1=new ax();
		 a1.start();
		
		 //System.out.println("Total Earning :"+a1.t);
		 synchronized(a1) {
			 try {
				a1.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 System.out.println("Total Earning :"+a1.t);
		 }
	}
}







































//InterThread Communication is the process in  which thread releases the lock and enter into paused state and another thread acquires the lock and continue to execute 
// mthds - wait notify & nootify all are nt the mthd of the Thread class rather the mthd of the object class