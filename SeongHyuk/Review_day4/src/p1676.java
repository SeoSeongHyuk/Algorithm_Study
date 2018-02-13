import java.util.Scanner;

public class p1676 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		long topcountTwo = 0;
		long topcountFive = 0;
		long botcountTwo = 0;
		long botcountFive = 0;
		long top = 0, bot = 0;
		
		for(long i = a; i >= a-b+1; i--) {
			long digit = i;
			
			while(digit%2 == 0) {
				topcountTwo++;
				digit /= 2;
			}
			while(digit%5 == 0) {
				topcountFive++;
				digit /= 5;
			}
		}
		top = (topcountTwo > topcountFive) ? topcountFive : topcountTwo;
		
		for(long i = 2; i <= b; i++) {
			long digit = i;
			
			while(digit%2 == 0) {
				botcountTwo++;
				digit /= 2;
			}
			while(digit%5 == 0) {
				botcountFive++;
				digit /= 5;
			}
		}
		bot = (botcountTwo > botcountFive) ? botcountFive : botcountTwo;
		
		System.out.println((top > bot) ? bot : top);
	}

}
