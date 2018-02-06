import java.util.Scanner;

import java.util.Scanner;

public class p1699 {
	static int[] d;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1];
		System.out.println(dp(n));
	}

	public static int dp(int n) {
		if(n == 0) return 0;
		
		if(d[n] > 0) return d[n];
		
		int min = Integer.MAX_VALUE;
		int check = 0;
		for(int i = 1; i <= n; i++) {
			check = i * i; // (int) Math.pow(i, 2);	// i * i 가 훨씬 빠르고, 메모리도 적게 먹는다.
			if(n-check >= 0)
				min = Math.min(min, dp(n-check)+1);
			else 
				break;
		}
		
		return d[n] = min;
	}
}
