import java.util.Scanner;

public class p11054 {
	static int[] d;
	static int[] num;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		num = new int[n+1];
		
		for(int i = 1; i <= n; i++)
			num[i] = scan.nextInt();
		
		int output = 0;
		int leftmax = 0;
		int rightmax = 0;
		for(int i = n; i > 0; i--) {
			d = new int[n+1];
			leftmax = leftdp(i);
			d = new int[n+1];
			rightmax = rightdp(i);
			output = Math.max(output, leftmax+rightmax-1);
		}
		System.out.println(output);
	}
	
	public static int leftdp(int n) {
		if(d[n] > 0)
			return d[n];
		
		int leftmax = 0;
		for(int i = n-1; i > 0; i--) {
			if(num[n] > num[i])
				leftmax = Math.max(leftmax, leftdp(i));
		}
		return d[n] = leftmax+ 1;
	}

	public static int rightdp(int n) {
		if(d[n] > 0)
			return d[n];
		
		int rightmax = 0;
		for(int i = n+1; i < num.length; i++) {
			if(num[n] > num[i])
				rightmax = Math.max(rightmax, rightdp(i));
		}
		
		return d[n] = rightmax + 1;
	}
}
