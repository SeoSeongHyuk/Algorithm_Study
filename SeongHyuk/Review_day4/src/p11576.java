import java.util.Scanner;

public class p11576 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		
		String[] num = new String[n];
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.next();
		}
		
		String output = aToB(num, a, b);
		System.out.println(output.substring(0, output.length()-1));
	}
	
	public static String aToB(String[] num, int a, int b) {
		long tmp = aToTen(num, a);
		String result = tenTob(tmp, b);
		return result;
	}
	
	public static long aToTen(String[] num, int a) {
		long sum = 0;
		long mul = 1;
		for(int i = num.length-1; i >= 0; i--) {
			sum += (Integer.parseInt(num[i]) * mul);
			mul *= a;
		}
		
		return sum;
	}
	
	public static String tenTob(long n, int b) {
		StringBuilder sb = new StringBuilder();
		
		while(n != 0) {
			int mod = (int) (n % b);
			sb.append(" " + mod);
			n /= b;
		}
		
		return sb.reverse().toString();
	}

}
