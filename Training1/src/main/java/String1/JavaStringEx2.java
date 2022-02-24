package String1;

public class JavaStringEx2 {
	public static void main(String[] args) {
		String s1 = "java";
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);

		String s3 = new String("example");
		System.out.println(s1 + " " + s2 + " " + s3);
	}
}
