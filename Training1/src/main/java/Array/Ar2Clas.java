package Array;
import java.util.*;
import java.util.Scanner;

			// take avg of sal

public class Ar2Clas {
	public static void main(String[] args) {
		//int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many record u want");
		int s=sc.nextInt();
		int sal[]=new int[s];
		
		System.out.println("enterr "+s+"sal");
		for (int i=0;i<s;i++) {
			sal[i]=sc.nextInt();
			
		}
		int sum=0;
		for (int i=0;i<s;i++) {
			sum+=sal[i];
			
		}
		int res=sum/sal.length;
		
		System.out.println(res);
		
		
		
	}
}
