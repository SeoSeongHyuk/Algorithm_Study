import java.util.Scanner;

public class p9461 {
	static long[] d;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
			while(t-- > 0) {
			int n = scan.nextInt();
			d = new long[n+1];
			System.out.println(dp(n));
		}
	}

	public static long dp(int n) {
		if(n == 1)
			return 1;
		else if(n == 2)
			return 1;
		else if(n == 3)
			return 1;
		else if(n == 4)
			return 2;
		else if(n == 5)
			return 2;
		
		if(d[n] > 0)
			return d[n];
		
		d[n] = dp(n-5) + dp(n-1);
		
		return d[n];
	}
}

// 자료형 int로하면 에러가 뜬다
