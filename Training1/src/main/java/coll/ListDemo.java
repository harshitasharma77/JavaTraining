package coll;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList; // Concurrent Collections -Important
import java.util.concurrent.CopyOnWriteArraySet;// for read write(Simultaneously)  to avoid ConcurrentModificationException
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Vector;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Collections;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List l=new ArrayList();
		
		//List<String>l=new ArrayList(); //genric
		//CopyOnWriteArrayList<String> l=new CopyOnWriteArrayList<String>();
	//	Set<String> l=new HashSet();
	//	CopyOnWriteArraySet<String> l=new CopyOnWriteArraySet<String>();
		CopyOnWriteArraySet<String> l=new CopyOnWriteArraySet<String>(); //allows read write simultaneously
		
		//List<String>l=new LinkedList(); 
		//List<String>l=new Vector();
		//Set<String>l=new HashSet();// random m uniq store
//		Set<String>l=new TreeSet();// sorted 
		//Set<String>l=new LinkedHashSet();// maintain position (sequenc)
		
		
		
		
//		l=Collections.synchronizedList(l);
//		Collections.synchronizedSet(l);							//both not working
		
		l.add("A");
		//l.add("uu");
		l.add(new String("B"));
		
		l.add("A11");
		//l.add("uu11");
		l.add(new String("B11"));
		
		
		
//		Collections.sort(l);
//		System.out.println(l);
//		System.out.println(l.get(4));
//		for(int i=0;i<l.size();i++) {
//			System.out.println(l.get(i));
//		}
//		
//		Iterator i=l.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		for(String s:l)//for each loop
		{
	//    l.add("hello");	// ConcurrentModificationException																																							// exception -> read|write -list to synchronize ni h.! in case of ArrayList(List<String>l=new ArrayList(); /)																																							// exception with vector also
			System.out.println(s);
			l.add("hello");	
		} // 
		
		l.stream().forEach(e->System.out.println(e)); //lambda
		
		
		
		
		
	}

}
//cant use new keyword with interface
// colllections(class) & collectn difference
//generic - phle btao ksa obj store kroge
// accept duplicate




// Differenc bet - HashSet LinkHashSet Tree HashSet
// Vector ArrayList Linked List
// Legacy classes - early vrsn of java m intorduc hua tha 1.1 m thn collectn came 
// internal working of set (important) -Hashset m Hmap ka obj bnta h - key:val pair & keys are always unique

// Initial Capacity (16) -by default 16 element ka size- & load Factor(0.75) - 75% of 16 -> jb b 75 ele store kia to size becomes double 