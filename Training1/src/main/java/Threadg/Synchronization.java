package Threadg;
																																												//wait,notify,notifyall-synchroniz k andr he use ho skte h
class bookmytikt 																																									// indepndt resorc ,thrd not extended 
{
	static int total_tikt=10;
	public void bookTikt(int bookTikt) {
		if (total_tikt>=bookTikt) {
		total_tikt=total_tikt-bookTikt;
		System.out.println(bookTikt+"tikt has been bookd");
		System.out.println(total_tikt +" Avalabl tkt r ");
		}
		else{
			System.out.println("tickeets cant be booked");
			System.out.println("Sorry " );
			}
		}
}
public class Synchronization extends Thread {
	static bookmytikt book;
	 int tikt;
	 public Synchronization(int tikt) {
		 this.tikt=tikt;
	 }
	public void run() {
		book.bookTikt(tikt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 book=new bookmytikt();																																												// static mthd m static he var use kr skte h
		
		Synchronization g=new Synchronization(4);
		//tikt=9;
		//g.tikt=9;		 																																								// any mthd. can b used
		g.start();
		Synchronization a=new Synchronization(2);
		synchronized(a) {
																																													// sunchronizd block -(wait,notifuy,notifyall) mthd ya block k andr hr use kr skte h --- wait mthd ko
			
			//a.start();
			try {
				
				a.start();
				a.wait();
				a.notify();
																																									//wait.strt-- wait ki no tym limit untill notify
																																									//wait m 
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
																																											//y ek resorc h
//		Synchronization h=new Synchronization(3);
//		h.start();
//		
//		Synchronization gg=new Synchronization(5);
//		gg.start();
	}

}
																																												// synchroniz -lock- tb tk release ni hga jb execytn pura ni hga