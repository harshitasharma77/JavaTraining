package String1;

public class StrConstrctr {
	public static void main(String[] args) {
		String s=new String();
		System.out.println(s);
		
		char c[]= {'h','e','l','o'};
		String g=new String(c);
		System.out.println(g);
		
		String d=new String(g);
		System.out.println(d);
		
		
		char t[]= {2,28,34,33,56,77,84,99};
		String w=new String(t);
		System.out.println(w);
		
		String p=new String(w);
		System.out.println(p);
		
	}

}
