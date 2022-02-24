package String1;
import java.util.*;

public class StrJoinr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner j=new StringJoiner(", ");
		j.add("hy");
		j.add("hello");
		j.add("hy1");
		j.add("hy2");
		
		System.out.println(j);
		StringJoiner joinNames5 = new StringJoiner(",", "[", "]"); // passing comma(,) and squarebrackets as delimiter 
		 
		 // Adding values to StringJoiner 
		 joinNames5.add("Rahul"); 
		 joinNames5.add("Raju"); 
		 joinNames5.add("Peter"); 
		 joinNames5.add("Raheem"); 
		 
		 System.out.println(joinNames5); 
		 System.out.println("##################\n\n");
		 
		 
		 
		 
		 
		 
		 StringJoiner joinNames= new StringJoiner(",", "[", "]"); 
		  // passing comma(,) and square -brackets as delimiter 
		  
		  // Adding values to StringJoiner 
		  joinNames.add("Rahul"); 
		  joinNames.add("Raju"); 
		  
		  // Creating StringJoiner with :(colon) delimiter 
		  StringJoiner joinNames2= new StringJoiner(":", "#", "#");
		  // passing colon(:) and square-brackets as delimiter 
		  
		  // Adding values to StringJoiner 
		  joinNames2.add("Peter"); 
		  joinNames2.add("Raheem"); 
		  
		  System.out.println("jm2 : "+joinNames2);
		  System.out.println("jm : "+joinNames);
		  // Merging two StringJoiner 
		  StringJoiner merge= joinNames.merge(joinNames2); 
		  System.out.println(merge);
		  System.out.println("jm2 : "+joinNames2);
		  System.out.println("jm : "+joinNames);
		  StringJoiner merge2= joinNames2.merge(joinNames); 
		  System.out.println(merge2);

	}
	
	}


