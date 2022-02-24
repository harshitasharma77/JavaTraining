package String1;

public class Str1 {
	public static void main(String[] args) {
		
		// BY STRING LITERAL ->  Stack/Pool memory
		
		String s = "welcome";
		String s1 = "Welcome";
		String s2 = "Welcome"; // donot create new memory
		boolean n=true;
		System.out.println(s + s1 + s2);
		
		if (s1==s2){	//checks the index
			System.out.println("same index");
		}
		n=s1.equals(s2); 	// chks the val only
		System.out.println(n);
		
		// BY NEW KEYWORD  ->	 Heap/Non Pool Memory
		
		String s3 = new String("WELcomez");
		String s4 = new String("Welcome");
		
		n=s1.equals(s4); 	// chks the val only
		System.out.println(n);
		
		if (s1==s4){	//checks the index
			System.out.println("same");
			}
		else {
			System.out.println("index not same"); // heap & stack Addresses are different
		}
			
	}

}
