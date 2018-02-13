import java.util.Collections;
import java.util.Scanner;

public class p11005 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long input = scan.nextLong();
		int b = scan.nextInt();
		int a = 'A';
		int c = 'B';
		System.out.println(changeToB(input, b));
	}

	public static String changeToB(long input, int b) {
		StringBuilder sb = new StringBuilder();
		
		while(input != 0) {
			long mod = input % b;
			if(mod >= 10)
				sb.append((char)(mod+55));
			else 
				sb.append(mod);
			input /= b;
		}

		// StringBuilder의 내장함수로 reverse()가 있다.
		return sb.reverse().toString();
	}

}
