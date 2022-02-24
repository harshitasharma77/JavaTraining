package Practice;
import java.util.Collections;
import java.util.*;

public class StrPrac {
	public static void main(String[] args) {
		String a="we are we doin we doin are we";
		String b[]=a.split(" ");
		//String n=" ";
		
		List<String> emptylist=Collections.emptyList();
		
		for (int i=0;i<b.length;i++){
		if (!(emptylist.contains(b.get(i)))){
			emptylist.add(b.get(i));
			
			
		}
		}
		System.out.println(emptylist);
	}

}
