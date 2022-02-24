package loops;

public class dowhile2 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 4);
		System.out.println("\n\n\t The sum of 1 to 4 is "+sum);
	}
}
