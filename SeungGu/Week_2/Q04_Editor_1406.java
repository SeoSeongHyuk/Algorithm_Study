import java.util.Scanner;

public class Q04_Editor_1406 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Use StringBuffer
		StringBuffer sb = new StringBuffer(scan.next());
		int t = scan.nextInt();

		// cursor position
		int cur = sb.length();

		while (t-- > 0) {
			if (scan.next() == "L") {
				if (cur != 0)
					cur--;
				System.out.println(sb);
			}

			else if (scan.next() == "D") {
				if (cur != sb.length())
					cur++;
				System.out.println(sb);
			}

			else if (scan.next() == "B") {
				if (cur != 0) {
					sb.delete(cur - 1, cur - 1);
					cur--;
				}
				System.out.println(sb);
			}

			else if (scan.next() == "P") {
				sb.insert(cur, scan.next());
				cur++;
				System.out.println(sb);
			}

		}
		scan.close();
		System.out.println(sb);
	}
}
