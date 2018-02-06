import java.util.Scanner;

public class p2156 {
	static long[][] d;
	static long[] wine;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		wine = new long[n+1];
		d = new long[n+1][3];
		for(int i = 1; i <= n; i++)
			wine[i] = scan.nextLong();

		System.out.println(dp(n, 0));
	}

	public static long dp(int n, int count) {
		if(n <= 0)
			return 0;
		
		if(d[n][count] > 0)
			return d[n][count];
		
		if(count == 2) {
			d[n][count] = dp(n-1, 0);
		} else {
			d[n][count] = Math.max(dp(n-1, count+1)+wine[n], dp(n-1, 0));
		}
		
		return d[n][count];
	}
}
