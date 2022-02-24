package String1;

public class StrMthd1 {
	public static void main(String[] args) {
		System.out.println("k");
		String d="Airplane";
		System.out.println(d+"char at 2 : "+d.charAt(2));
		System.out.println("Concat java"+d.concat("JAVa !"));
		
		
		String f="Hello";
		String g=" Hello ";
		String h=new String("Hello");
		
		System.out.println(g==h);//index
		
		System.out.println(g.equals(h)); //val
		System.out.println(f.equalsIgnoreCase("HELLo"));
		System.out.println(h.length());
		
		System.out.println(h.replace('e','Y'));
		System.out.println(g.toLowerCase());
		System.out.println(g.toUpperCase());
		
		System.out.println(g + "  JAVA 77 ");
		System.out.println(g + "  JAVA 77 ".trim());
		System.out.println(g.trim()+"77");
		
		//trim() :- remove trailing & leading sppaces
		
		String i="Hello JAAVAAA JAVa22";
		String o[]=i.split("");
		System.out.println(o.length);
		System.out.println(i.length());
		for (int j=0;j<o.length;j++) {
			System.out.println(o[j]);
			// --------------------------------DOUBT___________
		}
		
		String k="Greetings,I am  JAAVA";
		System.out.println(h.startsWith("He"));
		System.out.println(k.substring(4));
		System.out.println(k.substring(4,15));
		System.out.println(h.startsWith("He"));
		
		
		
		
		

		
		
		
	}

	
}
