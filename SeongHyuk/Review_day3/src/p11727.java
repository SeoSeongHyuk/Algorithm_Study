import java.util.Scanner;

public class p11727 {
	static int MOD = 10007;
	static int[] d;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1];
		
		System.out.println(dp(n));
	}
	
	public static int dp(int n) {
		if(n == 0)
			return 1;
		if(n < 0)
			return 0;
		
		if(d[n] > 0)
			return d[n];
		
		d[n] = dp(n-1) % MOD + dp(n-2)*2 % MOD;
		
		return d[n] % MOD;
	}
}
