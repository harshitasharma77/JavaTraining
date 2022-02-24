package Practice;

public class A2 {
	public static void main(String[] args) {

		System.out.println("Enter the String for which you want to calculate the frequency of each character: ");
		Scanner sc = new Scanner(System.in);
		String InpStr = sc.nextLine();
		char ch[] = InpStr.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int temp = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == ch[i]) {
					 temp++;
				}
				
				if (j < i && ch[i] == ch[j]) {
					break;
				}
				if (j == (ch.length - 1)) {
					System.out.println("Frequency of " + ch[i] + " is: " + temp);
				}
			}
		}



}}
