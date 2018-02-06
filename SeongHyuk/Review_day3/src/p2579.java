import java.util.Scanner;

public class p2579 {
	static int[] num;
	static int[] d;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		num = new int[n+1];
		d = new int[n+1];
		
		for(int i = 1; i <= n; i++)
			num[i] = scan.nextInt();
		
		System.out.println(dp(n));
	}

	public static int dp(int n) {
		if(n == 0)
			return 0;
		if(n < 0)
			return Integer.MIN_VALUE;
		
		if(n < 4) {
			d[n] = num[n] + Math.max(dp(n-1), dp(n-2));
		} else {
			d[n] = num[n] + Math.max(num[n-1]+num[n-3]+dp(n-4),
					Math.max(num[n-3]+num[n-4]+dp(n-5), num[n-3]+num[n-5]+dp(n-6)));
		}
		
		return d[n];
	}
}
