import java.util.Scanner;

public class p1463 {
	static int[] d;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d = new int[n+1];
		
		System.out.println(dp(n));
	}
	
	public static int dp(int n) {
		if(n == 1) return 0;
		
		if(d[n] > 0)
			return d[n];
		
		d[n] = dp(n-1) + 1;
				 
		if(n%3 == 0) 
			d[n] = Math.min(d[n], dp(n/3) + 1);
		
		if(n%2 == 0) 
			d[n] = Math.min(d[n], dp(n/2) + 1);
		
		
		return d[n];
	}

}
