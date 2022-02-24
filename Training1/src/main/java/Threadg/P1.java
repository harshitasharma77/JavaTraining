package Threadg;

class hare extends Thread {
	 static boolean b=true;
	public void run() {
		for (int i = 0; i < 100; i++) {
			
			if (b==true){
			if (i == 81) {
				try 
				{
					System.out.println("Hare sleeeeeeeeping");
					Thread.sleep(685);
					System.out.println("Hare waaaaaaaakes up.!");
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			if (i == 99) {
				System.out.println("Hare won");
				b=false;
				//System.out.println("----------------------"+b);
			}
			else {
				System.out.println("hare " + i);
				try 
				{
					Thread.sleep(10);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			}
		}
	}}
class t extends Thread {
		public void run() {

			for (int i = 0; i < 100; i++) {
				if (hare.b==true) {
				if (i == 99) {
					System.out.println("Turtle won");
					hare.b=false;
					//System.out.println("----------------------"+hare.b);
				}
				else{
					System.out.println("turtle " + i);
					try {
				
					Thread.sleep(16);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
				
				}		
				}
			}
		}

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			hare h=new hare();
			t tt=new t();
			
			h.start();
			tt.start();
	}
	}