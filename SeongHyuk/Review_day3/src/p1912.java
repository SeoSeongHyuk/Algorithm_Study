import java.util.Scanner;

public class p1912 {
	static int[] d;
	static int[] num;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		num = new int[n+1];
		d = new int[n+1];
		for(int i = 1; i <= n; i++) {
			num[i] = scan.nextInt();
			d[i] = num[i];
		}

		for(int i = 2; i <= n; i++) {
			if(d[i-1] + num[i] > d[i])
				d[i] = d[i-1] + num[i];
		}
		
		int output = 0;
		for(int i = n; i > 0; i--)
			output = Math.max(output, dp(i));
		System.out.println(output);
	}
	
	public static int dp(int n) {
		if(n == 0) return 0;
		
		d[n] = Math.max(d[n], dp(n-1)+num[n]);
		
		return d[n];
	}

}
