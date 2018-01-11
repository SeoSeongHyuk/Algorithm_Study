import java.util.Scanner;

public class p10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		int a = 0, b = 0;
		for(int i = 0; i < t; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a + b);
		}
	}

}
