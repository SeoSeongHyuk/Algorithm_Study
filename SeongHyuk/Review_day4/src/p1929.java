import java.util.Scanner;

public class p1929 {
	static int[] prime = new int[10000001];
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

		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int i = a; i <= b; i++) {
			if(prime[i] == 0)
				System.out.println(i);
		}
	}

}
