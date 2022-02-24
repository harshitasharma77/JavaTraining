package Practice;
import java.util.*;

public class iteratorprac {
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("a");
		a.add("h");
		   a.add("A");
	        a.add("B");
	        a.add("C");
	        a.add("D");
	        a.add("E");
	        
	        String search="C";
	       Iterator itr=a.iterator();
	        while(itr.hasNext()) 
	        {
	        if(itr.next()==search)
	        {
	        	System.out.println(search);
	        	System.out.println(itr);
	        }
	        else
	        {
	        	
	        }
	        	
	        }
	     
	}

}
