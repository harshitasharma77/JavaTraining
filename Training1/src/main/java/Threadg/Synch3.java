package Threadg;
class Table{
	synchronized void ptable(int n) {
	for(int i=1;i<6;i++) {
		System.out.println(n*i+"n");
		try {
			Thread.sleep(100);
		}
		catch(Exception h) {
			h.printStackTrace();
		}
	}
	}
}

class one extends Thread{
	Table t;
	one(Table t){
		this.t=t;
	}
	public void run() {
		t.ptable(2);
	}
	
}

class two extends Thread{
	Table t;
	two(Table t){
		this.t=t;
		
	}
	public void run() {
		t.ptable(3);
	}
}
public class Synch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Table oo=new Table();
			one tt=new one(oo);
			two t1=new two(oo);
			tt.start();
			t1.start();
	}

}
