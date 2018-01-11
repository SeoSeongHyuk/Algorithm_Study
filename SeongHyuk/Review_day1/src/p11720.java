import java.util.Scanner;

public class p11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String input = scan.next();
		int output = 0;
		
		for(int i = 0; i < n; i++) {
			output += Integer.parseInt(input.charAt(i) + "");
		}
		
		System.out.println(output);
	}
}
