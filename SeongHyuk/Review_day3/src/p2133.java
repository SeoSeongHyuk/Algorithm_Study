import java.util.Scanner;

public class p2133 {
	static int[] d;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n + 1];

		System.out.println(dp(n));
	}

	public static int dp(int n) {
		if (n < 0)
			return 0;
		else if (n == 0)
			return 1;

		if (d[n] > 0)
			return d[n];

		d[n] = dp(n-2) * 3;
		for(int i = 4; i <= n; i+=2)
			d[n] += dp(n-i) * 2;
		
		return d[n];
	}

}
