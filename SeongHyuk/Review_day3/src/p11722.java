import java.util.Scanner;

public class p11722 {
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
		for(int i = n; i > 0; i--) {
			output = Math.max(output, dp(i));
		}
		System.out.println(output);
	}
	
	public static int dp(int n) {
	
		if(d[n] > 0)
			return d[n];
		
		for(int i = n-1; i > 0; i--) {
			if(num[n] < num[i])
				d[n] = Math.max(d[n], dp(i));
				// 아래 d[n] + 1이라고 해준 이유는? 해당 수의 길이를 증가시켜 주기 위해서
				// dp(i) + 1이라 하면, i번째 수를 1증가 시켜주는 것이므로, 맨 처음의 수가 들어가지 않는다.
		}
		
		return d[n]+1;
	}
}
