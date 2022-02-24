package coll;
import java.util.HashMap;
import java.util.*;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;


public class Hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,String> m=new HashMap();
		ConcurrentHashMap<String,String> m=new ConcurrentHashMap<String,String>();
		m.put("A","B" );
		m.put("C","D" );
		m.put("E","F" );
		m.put("E","H" );
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.get("E"));
		System.out.println(m.containsKey("A"));
		System.out.println(m.containsValue("B"));
		
		m.replace("C", "X");
		m.replace("B", "Y");
		System.out.println("Kkkkkkkkkkkkkk"+m);
		
		Set s=m.entrySet(); //map ko set m convert kr dega
		System.out.println(s);
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			
			m.put("I","T");
			System.out.println(me.getKey()+" "+me.getValue());// map has anthr clas entry inside it
			
			System.out.println("****************************");
			//System.out.println(it.next());		// will print keys and vals both
		}
		s.stream().forEach(e->System.out.println(e)); //lambda
		s.forEach((f)->{System.out.println(f);});
	}
}
