package String1;

import java.util.*;

public class StrToknizr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer s = new StringTokenizer("Hello how are you ");
		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
		System.out.println("Using Constructor 2 - ");
		StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", ":");
		while (st2.hasMoreTokens())

		{
			System.out.println(st2.nextToken());
		}

		System.out.println("Using Constructor 3 - ");
		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", ":", true);
		while (st3.hasMoreTokens())

		{
			System.out.println(st3.nextToken());

		}
	}

}
