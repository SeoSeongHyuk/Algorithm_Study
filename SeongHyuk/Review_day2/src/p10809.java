import java.util.Scanner;

public class p10809 {
	static int[] alphabet = new int[26];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// a = 97 /  z = 122
		
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String input = scan.next();
		for(int i = 0; i < input.length(); i++) {
			int ch = input.charAt(i);
			if(alphabet[ch-97] == -1)
				alphabet[ch-97] = i;
		}

		for(int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}

}
