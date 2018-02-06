import java.util.Scanner;

public class p11053_r {
	static int[] d;
	static int[] num;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1];
		num = new int[n+1];
		for(int i = 1; i <= n; i++) {
			num[i] = scan.nextInt();
		}
		
		
		int output = 0;
		for(int i = n; i >= 1; i--) {
			output = Math.max(output, dp(i));
		}
		System.out.println(output);
	}
	
	public static int dp(int n) {
		
		if(d[n] > 0)
			return d[n];
		
		for(int i = n-1; i > 0; i--) {
			if(num[n] > num[i])
				d[n] = Math.max(d[n], dp(i));
		}
		
		return d[n]+1;
	}
}