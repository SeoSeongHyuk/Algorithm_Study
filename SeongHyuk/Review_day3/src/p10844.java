import java.util.Scanner;

public class p10844 {
	static long MOD = 1000000000;
	static long[][] d;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new long[n+1][10];
		long output = 0;
		for(int i = 1; i <= 9; i++)
			output += dp(n, i);
		System.out.println(output % MOD);
	}

	public static long dp(int n, int digit) {
		if(n == 1) return 1;
		
		if(d[n][digit] > 0) return d[n][digit];
		
		if(digit == 0)
			d[n][digit] = dp(n-1, 1) % MOD;
		else if(digit == 9)
			d[n][digit] = dp(n-1, 8) % MOD;
		else
			d[n][digit] = dp(n-1, digit-1) % MOD + dp(n-1, digit+1) % MOD;
		
		return d[n][digit] % MOD;
	}
}
// 2차원 배열 이용한다는 점
// 어디서  % MOD 를 적용해줘야 할지? 정확한 위치는 어디일까?