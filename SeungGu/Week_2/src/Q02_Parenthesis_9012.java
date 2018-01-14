import java.util.Scanner;
import java.util.Stack;

public class Q02_Parenthesis_9012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			int count = 0;
			String st = scan.next();
			int stLength = st.length();

			// 입력한 문자열의 크기만큼 for문을 실행
			for (int i = 0; i < stLength; i++) {
				char temp = st.charAt(i);
				// 글자가 "("일 때
				if (temp == 40)
					count++;
				// 글자가 ")"일 때
				else if (temp == 41) {
					// 전에 "("가 있다면(닫히지 않은 괄호가 있다면)
					if (count > 0)
						count--;
					// 닫히지 않은 괄호가 없는데 닫으려 한다면
					else
						count = 1111111111;
				}
			}

			if (count == 0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		scan.close();
	}
}