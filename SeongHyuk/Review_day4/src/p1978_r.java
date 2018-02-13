import java.util.Scanner;

public class p1978_r {
	static int[] prime = new int[1001];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		prime[1] = 1;
		for(int i = 2; i < prime.length; i++) {
			if(prime[i] == 0) {
				int convert = 2;
				while(i*convert < prime.length) {
					prime[i*convert] = 1;
					convert++;
				}
			} else {
				continue;
			}
		}

		int n = scan.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int input = scan.nextInt();
			if(prime[input] == 0)
				count++;
		}
		System.out.println(count);
		
	}

}
