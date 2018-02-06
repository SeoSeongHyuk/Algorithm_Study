import java.util.Scanner;

public class p9465 {
	static int[][] score;
	static int[][] d;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			score = new int[3][n+1];
			d = new int[n+1][3];
			
			for(int i = 1; i <= 2; i++) {
				for(int j = 1; j <= n; j++) {
					score[i][j] = scan.nextInt();
				}
			}
			
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < 3; i++)
				max = Math.max(max, dp(n, i));
			
			System.out.println(max);
		}
	}
	
	public static int dp(int n, int toggle) {
		if(n == 0)
			return 0;
		
		if(d[n][toggle] > 0)
			return d[n][toggle];
		
		if(toggle == 0)
			d[n][toggle] = Math.max(dp(n-1, 1), dp(n-1, 2));
		else if(toggle == 1)
			d[n][toggle] = Math.max(dp(n-1, 0), dp(n-1, 2)) + score[1][n];
		else
			d[n][toggle] = Math.max(dp(n-1, 0), dp(n-1, 1)) + score[2][n];
		
		return d[n][toggle];
	}

}
