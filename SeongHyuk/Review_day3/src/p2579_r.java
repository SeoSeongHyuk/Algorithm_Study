import java.util.Scanner;

public class p2579_r {
	static int[][] d;
	static int[] num;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n + 1][3];
		num = new int[n + 1];

		for (int i = 1; i <= n; i++)
			num[i] = scan.nextInt();

		System.out.println(dp(n, 1));
	}

	public static int dp(int n, int time) {
		if(n == 0)
			return 0;
		else if (n == 1)
			return num[1];		
		
		if (d[n][time] > 0)
			return d[n][time];

		if (time == 2)
			d[n][time] = num[n] + dp(n - 2, 1);
		else
			d[n][time] = num[n] + Math.max(dp(n - 1, time + 1), dp(n - 2, 1));

		return d[n][time];
	}
}

// 규칙은 깨지지 않는다... 변수가 두 개면 2차원 배열로 하자
// time에 따라 나올 수 있는 값이 여러 개일 수 있다. 따라서 덮어씌어짐으로 돌아가지 않았다.
