package Threadg;
class First1  {
	public void display(String a) {
		System.out.println("["+a);
		try {
			Thread.sleep(1000);
		}
		catch(Exception n) {
			n.printStackTrace();
		}
		System.out.println("]");
	}
}
class Second1 extends Thread {
	First1 o;
	String a;
	Second1(First1 d,String j){
		o=d;
		a=j;
		//start();
	}
	public void run() {
		synchronized(o) {
			o.display(a);
		}
//		o.display(a);
	}
}
public class Synch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			First p=new First();
			Second c=new Second(p,"kkkkkkkkk");
			Second cc=new Second(p,"jjjjjjjjj");
			Second ccc=new Second(p,"hyyyyyy");
//			//c.start();
//			cc.start();
//			ccc.start();
					c.run();
	}

}
