import java.util.Scanner;

public class p6588 {
	static boolean[] prime = new boolean[1000001];
	static int MAX = 1000001;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 에라토테네스의 체?
		prime[0] = true;
		prime[1] = true;
		for(int i=2; i < MAX; i++) {
			for(int j = i*2; j < MAX; j+=i)
				if(prime[j] == false)
					prime[j] = true;
		}
		
		while(scan.hasNext()) {
			int n = scan.nextInt();
			if(n == 0)
				break;
			
			check(n);
		}
	}
	
	public static void check(int n) {
		for(int i = 2; i < n; i++) {
			if(prime[i] == false) {
				if(prime[n-i] == false) {
					System.out.println(n + " = " + i + " + " + (n-i));
					break;
				}
			}
		}
	}

}
