import java.util.Scanner;

public class p10872 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long output = 1;
		for(int i = 1; i <= n; i++) {
			output *= i;
		}
		
		System.out.println(output);

	}

}
