import java.util.Scanner;

public class Q13_PrintBy10pcs_11721 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s1 = in.next();
		int leng = s1.length();
		int a = 0;
		while (a <= leng) {
			if (a + 10 > leng) {
				System.out.println(s1.substring(a, leng));
				break;
			} else {
				System.out.println(s1.substring(a, a + 10));
				a += 10;
			}
		}
	}

}
