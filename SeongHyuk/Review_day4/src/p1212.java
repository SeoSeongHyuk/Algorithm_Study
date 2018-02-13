import java.util.Scanner;

public class p1212 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		StringBuilder sb = new StringBuilder();

		int check = 0;
		while (check < input.length()) {
			if (!(input.charAt(check) == '0'))
				break;
			check++;
		}
		
		if (check == input.length())
			sb.append("0");
		else {
			for (int i = check; i < input.length(); i++) {
				int n = Integer.parseInt(input.charAt(i) + "");
				String temp = "";

				while (n != 0) {
					int mod = n % 2;
					temp = mod + temp;
					n /= 2;
				}

				if (i != check) {
					if (temp.length() == 1)
						temp = "00" + temp;
					else if (temp.length() == 2)
						temp = "0" + temp;
					else if (temp.length() == 0)
						temp = "000" + temp;
				}

				sb.append(temp);
			}
		}
		System.out.println(sb.toString());
	}
}
