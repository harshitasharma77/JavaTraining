package VideoRental;
import java.util.*;

class Video {
	Video(String a){
		this.title=a;
	}
	String title = "";
	boolean check;
	double rating;

	void being_checked() {
		this.check = false;
	}

	public void being_returned() {
		this.check = false;
	}

	void setrating(int r) {
		if (r <= 5 && r >= 0) {
			this.rating = r;
		}
	}

}

class VideoStore {
	int ref;

	 void addVideo(String a) {
		Video x=new Video(a);
		VideoStoreLauncher.l.add(x);
	}

	public void checkOut(String b) {
			for(int i=0;i<VideoStoreLauncher.l.size();i++) {
				if (VideoStoreLauncher.l.get(i).title.equals(b)){
					if (VideoStoreLauncher.l.get(i).check==false) {
						VideoStoreLauncher.l.get(i).check=true;
						}
					else {
						System.out.println("not available.");
						}}
				else {
					System.out.println("vedioNotFound");
				}
			
		}}

	public void returnVideo(String c) {
		for(int i=0;i<VideoStoreLauncher.l.size();i++) {
			if (VideoStoreLauncher.l.get(i).title.equals(c)){
				if (VideoStoreLauncher.l.get(i).check==true) {
					VideoStoreLauncher.l.get(i).check=false;
					}}
			}
	}

	public void recieverating(String e, int p) {
		for(int i=0;i<VideoStoreLauncher.l.size();i++) {
			if (VideoStoreLauncher.l.get(i).title.equals(e)){
				VideoStoreLauncher.l.get(i).setrating(p);
	}
		}}
	public void listInventory() {
		for(int i = 0;i<VideoStoreLauncher.l.size();i++) {
			System.out.println("Name :"+VideoStoreLauncher.l.get(i).title+"\n"+"Rating :"+VideoStoreLauncher.l.get(i).rating+"\n"+"Status if checked :"+VideoStoreLauncher.l.get(i).check);
		}
		System.out.println("\n\n\n");
		System.out.println(VideoStoreLauncher.l);
	}

}

public class VideoStoreLauncher {
	public static ArrayList<Video> l = new ArrayList<Video>();
	
	public static void main(String[] args) {
		String name;
		int rating;
	
		VideoStore v=new VideoStore();
		while(true) {
			System.out.println(" ############################### ");
			System.out.println("What you want to do");
			System.out.println("Enter 1 to view inventory");
			System.out.println("Enter 2 to add a video inventory");
			System.out.println("Enter 3 to check out a video");
			System.out.println("Enter 4 to return a video");
			System.out.println("Enter 5 to rate a video");
			System.out.println("Exit 0");
			Scanner x= new Scanner(System.in);
			int ii =x.nextInt();
			if (ii==1) {
				v.listInventory();
			}
			if (ii==2) {
				System.out.println("enter which vedio u want to add :");
				x.nextLine();
				name=x.nextLine();
				v.addVideo(name);
			}
			if (ii==3) {
				System.out.println("enter which vedio u want to check :");
				x.nextLine();
				name=x.nextLine();
				v.checkOut(name);
				
			}
			if(ii==4) {
				System.out.println("enter which vedio u want to return :");
				x.nextLine();
				name=x.nextLine();
				v.returnVideo(name);
			}
			if (ii==5) {
				System.out.println("enter which vedio u want to rate :");
				x.nextLine();
				name=x.nextLine();
				System.out.println("Enter rating of "+name);
				rating =x.nextInt();
				v.recieverating(name,rating);	
				name="";
				rating=0;
				
			}
			if (ii==0) {
				break;
			}
		
	}
}}

// checkout