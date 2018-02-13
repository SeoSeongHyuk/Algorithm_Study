import java.util.Scanner;

public class p2609 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int g = gcd(a, b);
		int l = a * b / g;
		System.out.println(g);
		System.out.println(l);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}

}
