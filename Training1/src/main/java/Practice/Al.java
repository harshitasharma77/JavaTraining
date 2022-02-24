package Practice;

import java.util.ArrayList;

public class Al {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<> a=new ArrayList<>(8);
			
			for (int i=0;i<3;i++) {
				a.add(i);
			}
			
			a.add(8);
			//a.add("k");
			System.out.println(a);
			
			a.remove(1);
			
			System.out.println(a);
			for (int i=0;i<a.size();i++) {
				System.out.println(a.get(i)+" ");
				System.out.println(a.get(i)+" ");
			}
			
	}

}
