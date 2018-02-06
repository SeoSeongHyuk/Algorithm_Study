import java.util.Scanner;

public class p11053 {
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
		// 위의 과정에서 자기 자신을 더하지 않는다. 그러므로 나중에 1을 더한다.
		System.out.println(output+1);
	}
	
	public static int dp(int n) {
		// n이 1일 때를 고려해야한다.
		if(n == 0)
			return 0;
		
		if(d[n] > 0)
			return d[n];
		
		for(int i = n; i > 0; i--) {
			if(num[n] > num[i])
				d[n] = Math.max(d[n], 1 + dp(i));
		}
		
		return d[n];
	}
}