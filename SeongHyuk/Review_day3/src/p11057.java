import java.util.Scanner;

public class p11057 {
	static int MOD = 10007;
	static int[][] d;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1][10];
		int output = 0;
		for(int i = 0; i <= 9; i++)
			output += dp(n, i);
		System.out.println(output % MOD);
	}
	
	public static int dp(int n, int digit) {
		// dp loop에 들어왔을 때, 이미 digit이 정해진 것이므로 n == 1일 때, return 1을 해준다.
		if(n == 1)
			return 1;
		
		if(d[n][digit] > 0)
			return d[n][digit];
		
		for(int i = digit; i <= 9; i++)
			d[n][digit] += dp(n-1, i) % MOD;
		
		return d[n][digit];
	}

}
