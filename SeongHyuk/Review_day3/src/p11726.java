import java.util.Scanner;

public class p11726 {
	static int MOD = 10007;
	static int[] d;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1];
		
		System.out.println(dp(n));
	}
	
	public static int dp(int n) {
		// 종료 조건	
		if(n < 0)
			return 0;
		
		if(n == 0)
			return 1;
		
		// memorization
		if(d[n] > 0)
			return d[n];
		
		d[n] = dp(n-1) + dp(n-2);
		
		return d[n] % MOD;
	}

}
