package String1;

public class StrBfr {
	public static void main(String args[]) {
 StringBuffer f=new StringBuffer("object language");
 System.out.println("orignal String : "+f);
 System.out.println(f.length());
 
 for(int i=0;i<f.length();i++) {
	 int p=i+1;
	 System.out.printf(" char at "+p+" is "+f.charAt(i)+"\n");
 }
 	String s=new String(f.toString());
 	int p=f.indexOf("language");
 	f.insert(p,"Oriented");
 	System.out.println("Modified STring :"+f);
 	
 	f.setCharAt(6,'*');
 	System.out.println("Now the String is :"+f);
 	
 	f.append("Improved Security ");
 	System.out.println("Append String :"+f);
 	
 
 
	}
	
}
