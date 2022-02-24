
package VideoRental;
import java.util.*;
class Vdo{
	String title="";
	boolean checkd=false;
	double r=0;
	
	Vdo(String a){
		this.title=a;
	}
	
	public void beingCheckd() {
		boolean checkd=true;
	}
	public void beingReturnd() {
		boolean checkd=false;
		}
	public void setRating(int r) {
		this.r=r;
	}
}
class VdoStore{
	void addVideo(String a) {
		Vdo q=new Vdo(a);
		Vlauncher.vv.add(q);
	}
	void checkOut(String a) {
		for(int i=0;i<Vlauncher.vv.size();i++){
			if(Vlauncher.vv.get(i).title.equals(a)) {
				if (Vlauncher.vv.get(i).checkd==false) {
					Vlauncher.vv.get(i).checkd=true;
				}
				else {
					System.out.println("already Checkd .!");
				}
			}
			else {
				System.out.println("Not Available in Inventory .!");
			}
		}
	}
	void returnVideo(String a) {
		for(int i=0;i<Vlauncher.vv.size();i++){
			if(Vlauncher.vv.get(i).title.equals(a)) {
				if (Vlauncher.vv.get(i).checkd==false) {
					Vlauncher.vv.get(i).checkd=true;
				
	}}}}
	void receiveRating(String a, int b) {
		for(int i=0;i<Vlauncher.vv.size();i++){
			if(Vlauncher.vv.get(i).title.equals(a)) {
				Vlauncher.vv.get(i).setRating(b);
			}
	}}
	void listInventory() {
		for(int i=0;i<Vlauncher.vv.size();i++){
			System.out.println("Name :"+Vlauncher.vv.get(i).title+"Rating :"+Vlauncher.vv.get(i).r+"Checked "+Vlauncher.vv.get(i).checkd);
		}
	}
}
public class Vlauncher {
	static ArrayList<Vdo> vv=new ArrayList<Vdo>(2);
	
	public static void main(String[] args) {
		String name;
		int rate;
		
		// not instanc |^
		
		// TODO Auto-generated method stub
		VdoStore v=new VdoStore();
		Scanner r=new Scanner(System.in);
		System.out.println("enter 0 - to Exit ");
		System.out.println("enter 1 - to see list inventory");
		System.out.println("enter 2 - to add into list inventory");
		System.out.println("enter 3 - to CheckOut");
		System.out.println("enter 4 - to  Rate");
		System.out.println("enter 5- to Return");
		
		while(true) {
			System.out.println("entr ur choice");
			int n=r.nextInt();
		
			if (n==1) {
				v.listInventory();
			}
			if (n==2) {
				System.out.println("Enter name of video you wanna add");
				r.nextLine();
				name = r.nextLine();
				v.addVideo(name);
			}
			if (n==3) {
				System.out.println("Enter name of video you CheckOut");
				r.nextLine();
				name = r.nextLine();
				v.checkOut(name);
			}
			if(n==4) {
				System.out.println("Enter name of video you Rate");
				r.nextLine();
				name = r.nextLine();
				System.out.println("Enter Rating");
				rate = r.nextInt();
				v.receiveRating(name,rate);
			}
			if (n==5) {
				System.out.println("Enter name of video you want to return");
				r.nextLine();
				name = r.nextLine();
				v.returnVideo(name);
			}
			if (n==0) {
				break;
			}
		}}
		
		

	
}
