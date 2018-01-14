import java.util.Scanner;

public class Q05_AplusB4_10951 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, result;
		
		while (in.hasNext()) {
			num1 = in.nextInt();
			num2 = in.nextInt();
			result = num1 + num2;
			System.out.println(result);
		}
	}

}
