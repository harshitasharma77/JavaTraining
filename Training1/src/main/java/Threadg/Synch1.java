package Threadg;
class First{
	synchronized public void display(String a) {
	// public void display(String a) {
		System.out.println("["+a);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Second extends Thread{
	String msg;
	First fobj;
	Second(First a,String b){
		fobj=a;
		msg=b;
		start();
	}
	public void run() {
		fobj.display(msg);
	}
}
public class Synch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First fn=new First();
		Second s=new Second(fn," ffff ");
		Second ss=new Second(fn," hy ");
		Second sss=new Second(fn," uyuyuuyuyuyuyuuy ");

	}

}
//In the above program, object fnew of class First is shared by all the three running threads(ss, ss1 and ss2) to call the shared method(void display). Hence the result is nonsynchronized and such situation is called Race condition..
