import java.util.Scanner;

public class p2011_r2 {
	static int[] d;
	static int[] num;
	static int MOD = 1000000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int n = input.length();
		
		d = new int[n+1];
		num = new int[n+1];
		
		for(int i = 0; i < n; i++) {
			num[i+1] = Integer.parseInt(input.charAt(i)+"");
		}
		
		System.out.println(dp(n));
	}

	public static int dp(int n) {
		if(n == 0)
			return 1;
		
		if(d[n] > 0)
			return d[n];
		
		int digitOne = num[n];
		if(0 < digitOne && digitOne < 10)
			d[n] = dp(n-1) % MOD;
		
		int digitTen = num[n-1] * 10 + num[n];
		if(10 <= digitTen && digitTen <= 26)
			d[n] += dp(n-2) % MOD;
		
		return d[n] % MOD;
	}
}
