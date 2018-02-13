import java.util.Scanner;

public class p11653_r {
	static boolean[] prime = new boolean[10000001];
	static int MAX = 10000001;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int size = n;
		setPrime();
		
		for(int i = 2; i <= size; i++) {
			if(prime[i] == false) { // 소수
				if(prime[n] == false) {
					sb.append(n);
					break;
				}
				
				while(n % i == 0) {
					sb.append(i + "\n");
					n /= i;
				}
			}
		}
		System.out.println(sb.toString());
	}
	
	static public void setPrime() {
		prime[0] = true;
		prime[1] = true;
		for(int i = 2; i < MAX; i++) {
			for(int j = i*2; j < MAX; j+=i) {
				if(prime[j] == false) 
					prime[j] = true;
			}
		}
	}
	
}
