import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class p11576_r {
	static String[] num;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int n = scan.nextInt();
		num = new String[n];
		for(int i = 0; i < n; i++) {
			num[i] = scan.next();
		}
		
		String output = convert(num, a, b);
		System.out.println(output.substring(0, output.length()-1));
	}

	public static String convert(String[] num, int	a, int b) {
		long sum = 0;
		long mul = 1;
		for(int i = num.length-1; i >= 0; i--) {
			sum += (Integer.parseInt(num[i]) * mul);
			mul *= a;
		}
		
		ArrayList<String> answer = new ArrayList<>();
		while(sum != 0) {
			long mod = sum % b;
			answer.add(mod+" ");
			sum /= b;
		}
		
		String output = "";
		Iterator<String> iter = answer.iterator();
		while(iter.hasNext()) {
			output = iter.next() + output;
		}
		
		return output;
	}
}
