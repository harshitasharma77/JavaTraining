package Practice;

import java.util.Scanner;

public class p3swtchcase {
	public static void main(String[] args)
	{
		
		Scanner f=new Scanner(System.in);
		System.out.println("Enter day ");
		String d=f.nextLine();
		switch(d)
		
		{
		case "M":
			System.out.println("Mon");
			break;
		case "T":
			System.out.println("Tues ");
			break;
		case "W":
			System.out.println("W ");
			break;
		case "Th":
			System.out.println("Thurs ");
			break;
		case "F":
			System.out.println("Fri ");
			break;
		case "S":
			System.out.println("sat day ");
			break;
		default:
				System.out.println("Sun day ");
				break;
			
		}
	}

}
