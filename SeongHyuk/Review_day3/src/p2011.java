import java.util.Scanner;

public class p2011 {
	static int[] d;
	static int MOD = 1000000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1];
		System.out.println(dp(n));
	}

	public static int dp(int n) {
		if(n == 0)
			return 1;
		
		if(d[n] > 0)
			return d[n];
		
		long modTen = n % 10;
		long modHun = n % 100;
		
		if(1 <= modTen && modTen <= 9)
			d[n] = dp(n / 10) % MOD;
		if(10 <= modHun && modHun <= 26)
			d[n] += dp(n / 100) % MOD;
		
		return d[n] % MOD;
	}
}
