import java.util.Scanner;

public class p11653 {
	static boolean[] prime = new boolean[10000001];
	static int MAX = 10000001;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i < MAX; i++) {
			for (int j = i * 2; j < MAX; j += i)
				if (prime[j] == false)
					prime[j] = true;
		}

		StringBuilder sb = new StringBuilder();
		int n = scan.nextInt();
		if(prime[n] == false) {
			System.out.println(n);
		} else {
			for (int i = 2; i < n; i++) {
				if (n == 1) {
					break;
				}
	
				if (prime[i] == false) {
					while (n % i == 0) {
						sb.append(i + "\n");
						n /= i;
					}
				}
			}
			sb.append(n);
		}

		System.out.println(sb.toString());
	}

}
