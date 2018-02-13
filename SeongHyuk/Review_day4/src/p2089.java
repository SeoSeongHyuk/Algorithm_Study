import java.util.Scanner;

public class p2089 {

	public static void main(String[] args) {
		/* test
		System.out.println(2/(-2) + " " + 2%(-2));
		System.out.println((-1)/(-2) + " " + (-1)%(-2));	
		System.out.println((-7)/(-14) + " " + (-7)%(-14));
		*/
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long input = scan.nextLong();
		
		// 예외처리 필요...
		if(input == 0)
			sb.append("0");
		
		while(input != 0) {
			long mod = input % (-2);
			long mul = input / (-2);
			if(mod >= 0)
				sb.append(mod);
			else {
				sb.append(mod+2);
				mul++;
			}
			input = mul;
		}
		System.out.println(sb.reverse().toString());
	}

}
