import java.util.Scanner;

public class p2193 {
	static long[][] d;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new long[n+1][2];
		
		System.out.println(dp(n, 1));
	}
	
	public static long dp(int n, int digit) {
		if(n == 1)
			return 1;
		
		if(d[n][digit] > 0)
			return d[n][digit];
		
		if(digit == 0)
			d[n][digit] = dp(n-1, 0) + dp(n-1, 1);
		else
			d[n][digit] = dp(n-1, 0);
		
		return d[n][digit];
	}

}
// 자료형을 long으로 바꿔줘야 하네 >> 주어진 input의 최대 범위를 넣어보고 확인함
// 아... 시간 복잡도가 부분적으로 2^n이 될 수 있다는 점!