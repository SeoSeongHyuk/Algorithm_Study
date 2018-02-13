import java.util.Scanner;

public class p9613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] num = new int[n];
			for(int i = 0; i < n; i++) {
				num[i] = scan.nextInt();
			}
			System.out.println(sumGcd(num));
		}
	}
	
	public static long sumGcd(int[] num) {
		long sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				int value = gcd(num[i], num[j]);
				sum += value;
			}
		}
		
		return sum;
	}
	
	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}

}
