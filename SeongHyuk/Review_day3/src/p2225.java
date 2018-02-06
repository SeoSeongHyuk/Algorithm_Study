import java.util.Scanner;

public class p2225 {
	static long[][] d;
	static long MOD = 1000000000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		d = new long[n+1][k+1];
		System.out.println(dp(n, k));
	}

	public static long dp(int n, int k) {
		if(n == 0)
			return 1;
		
		if(k == 0)
			return 0;
		
		if(d[n][k] > 0)
			return d[n][k];
		
		for(int i = 0; i <= n; i++) {
			d[n][k] += dp(n-i, k-1) % MOD;
		}
		
		return d[n][k] % MOD;
	}
}

// MOD의 위치에 따라 정답 여부가 달라진다.
