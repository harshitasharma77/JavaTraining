package Practice;
import java.util.*;

public class AA2 {
public static void main(String[] args) {
	
	String a="liveonlifewildlife";//14
	String f="life";
	int q=f.length();
	int t=0;
	int j=0;
	
	for( int i=0;i<a.length()-q+1;i++)
{
	j=i+4;
	if (f.equals(a.substring(i,j))) {
		t++;
	}
}
	System.out.println(t);

}
}
