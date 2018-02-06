import java.util.Scanner;

public class p2579_r2 {
	static int[][] d;
	static int[] num;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1][3];
		num = new int[n+1];
		for(int i = 1; i <= n; i++) {
			num[i] = scan.nextInt();
		}
		System.out.println(dp(n, 1));
	}
	public static int dp(int n, int k) {
		if(n == 0) return 0;
		if(n == 1) return num[1];
		
		if(d[n][k] > 0) return d[n][k];
		
		if(k == 1) {
			d[n][k] = Math.max(dp(n-1, 2), dp(n-2, 1)) + num[n];
		} else {
			d[n][k] =dp(n-2, 1) + num[n];
		}
		
		return d[n][k];
	}
}