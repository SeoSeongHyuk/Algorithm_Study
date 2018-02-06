import java.util.Scanner;

public class p9095 {
	static int[] d;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			d = new int[n+1];
			System.out.println(dp(n));
		}
	}
	public static int dp(int n) {
		if(n == 0)
			return 1;
		if(n < 0)
			return 0;
		
		if(d[n] > 0)
			return d[n];
		
		d[n] = dp(n-1) + dp(n-2) + dp(n-3);
		
		return d[n];
	}

}
