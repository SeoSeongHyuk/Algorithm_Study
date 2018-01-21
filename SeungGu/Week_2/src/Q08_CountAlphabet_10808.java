import java.util.Scanner;
import java.util.Stack;

public class Q08_CountAlphabet_10808 {

	static int TOP = 0;
	static int[] alphabet = new int[26];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String st = scan.nextLine();
		int length = st.length();
		for (int i = 0; i < length; i++) {
				char temp = st.charAt(i);
				alphabet[temp-97]++;
		}
		for (int i = 0; i < 26 ; i++) {
			System.out.print(alphabet[i] + " ");
	}
		scan.close();
	}
	

}