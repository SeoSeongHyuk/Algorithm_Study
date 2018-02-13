import java.util.Scanner;

public class p2004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long r = scan.nextLong();
		
		int top = 0;
		int bottom = 0;
		int countTwo = 0;
		int countFive = 0;
		
		for(long i = r; i <= n; i++) {	// 여기도 틀림
			while(i%2 == 0)
				countTwo++;
			while(i%5 == 0)
				countFive++;
		}
		top = Math.min(countTwo, countFive);

		countTwo = 0;
		countFive = 0;
		for(long i = 2; i <= r; i++) {
			while(i%2 == 0)
				countTwo++;
			while(i%5 == 0)
				countFive++;
		}
		bottom = Math.min(countTwo, countFive);
		
		System.out.println(Math.abs(top-bottom));
	}

}
