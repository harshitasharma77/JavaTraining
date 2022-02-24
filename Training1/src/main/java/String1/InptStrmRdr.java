package String1;
import java.util.*;

public class InptStrmRdr {
public static void main(String[] args) {
	 String name="1221";
	 String n="";
	 InputStreamReader r=new InputStreamReader(System.in);
	 bufferReader br=new BufferReader(r);
	 System.out.println("enter the first no");
	 try {
		 int num1=Integer.parseInt(br.readLine());
		 System.out.println("NUm is :"+num1);
		 
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
}
}
