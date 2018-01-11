import java.util.Scanner;

public class p11021 {
	static int count = 1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int a = 0, b = 0;
		
		while(t-- > 0) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println("Case #"+(count++)+": " + (a+b));
		}

	}

}
