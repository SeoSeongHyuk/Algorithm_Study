import java.util.Scanner;

public class Q06_AplusB5_10952 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, result;

		while (true) {
			num1 = in.nextInt();
			num2 = in.nextInt();
			if (num1 == 0 && num2 == 0)
				break;
			result = num1 + num2;
			System.out.println(result);
		}
	}

}
