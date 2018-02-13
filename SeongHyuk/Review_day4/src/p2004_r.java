import java.util.Scanner;

public class p2004_r {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long m = scan.nextLong();
		
		long answer = Math.min(countTwo(n)-countTwo(m)-countTwo(m),
				countFive(n)-countFive(m)-countFive(m));
		
		System.out.println(answer);
	}

	public static long countTwo(long n) {
		long ans = 0;
		for(long i = 2; i <= n; i*= 2) {
			ans += n/i;
		}
		return ans;
	}
	
	public static long countFive(long n) {
		long ans = 0;
		for(long i = 5; i <= n; i*=5) {
			ans += n/i;
		}
		return ans;
	}
}
