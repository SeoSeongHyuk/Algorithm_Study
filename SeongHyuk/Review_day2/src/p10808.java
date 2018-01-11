import java.util.Scanner;

public class p10808 {
	/* 아스키 코드
	 * A = 65 / a = 97 (26)
	 */
	static int[] alphabet = new int[26];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		for(int i = 0; i < input.length(); i++) {
			int tar = input.charAt(i);
			alphabet[tar-97]++;
		}
		
		for(int i = 0; i < alphabet.length; i++)
			System.out.print(alphabet[i] + " ");

	}

}
