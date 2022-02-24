package Array;
import java.util.*;
public class Arr1 {
	public static void main(String[] args) {
	int Score[]= {11,22,33,44,55,66,77,88,99};
	
	//  System.out.println("Score[0] "+Score[12]) ;
	System.out.println("Score[0] "+Score[1]) ;
	System.out.println("Score[0] "+Score[2]) ;
	System.out.println("Score[0] "+Score[3]) ;
	System.out.println("Score[0] "+Score[4]) ;
	System.out.println("Score[0] "+Score[5]) ;
	System.out.println("Score[0] "+Score[6]) ;
	
	String n="Hello";
	int p=n.length();
	int q=Score.length;
	System.out.println(p+q);
	
	for(int i=0;i<Score.length;i++) {
		System.out.println(Score[i]);
	}
	
	int[] marks=new int[10]; //allocate mmry of 10 ele at run time
	int []mark=new int[10];
	int mars[]=new int[10];
	//all valid
	
//	marks[0]=10;
//	marks[1]=10;
//	marks[2]=10;
//	marks[3]=10;
//	marks[4]=10;
	
	//Another Mthd - Scanner
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("hw many u want to entr :");
	//if 3 -> waste
	
	int size=sc.nextInt();
	int markss[]=new int[size];
	
	System.out.println("entr elemnts");
	for (int i=0;i<size;i++) {
		marks[i]=sc.nextInt();
		//or System.out.printlnmarks[i]
	}
	for (int i=0;i<size;i++) {
		System.out.println(marks[i]);
	}
	
	}
}

//Error(if Semi colon is missing) & Exception(IndexoutOfBond)

//  Exceptn-> handling - jin cheezo ko chhodte h unhe handle krna-> Exceptn -> runtime
// Exceptn -> terminate ho j ga pgm aage nhi chlega