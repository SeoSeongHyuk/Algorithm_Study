import java.util.Scanner;

public class p11055 {
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
		// n == 1 일때, num[1]을 선택하는 방법밖에 없다.
		// 그렇지 않다. 단지 개수가 하나일 떄를 의미하는 것이다.
		if(n == 0)
			return 0;
		
		if(d[n] > 0)
			return d[n];
		
		// i = 0일 때를 추가해준 이유는, n = 1일때, 동작하게 하기 위해서다.
		for(int i = n-1; i >= 0; i--) {
			if(num[n] > num[i])
				d[n] = Math.max(d[n], num[n] + dp(i));
		}
		
		return d[n];
	}
}
