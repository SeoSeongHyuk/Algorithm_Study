import java.util.Scanner;

public class p11052 {
	static int d[];
	static int price[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1];
		price = new int[n+1];
		for(int i = 1; i <= n; i++)
			price[i] = scan.nextInt();
		System.out.println(dp(n));
	}
	public static int dp(int n) {
		if(n == 0)
			return 0;
		
		if(d[n] > 0)
			return d[n];
		
		for(int i = 1; i <= n; i++) {
			d[n] = Math.max(d[n], dp(n-i)+price[i]);
		}
		
		return d[n];
	}

}
