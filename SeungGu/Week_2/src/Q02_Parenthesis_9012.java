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

			// �Է��� ���ڿ��� ũ�⸸ŭ for���� ����
			for (int i = 0; i < stLength; i++) {
				char temp = st.charAt(i);
				// ���ڰ� "("�� ��
				if (temp == 40)
					count++;
				// ���ڰ� ")"�� ��
				else if (temp == 41) {
					// ���� "("�� �ִٸ�(������ ���� ��ȣ�� �ִٸ�)
					if (count > 0)
						count--;
					// ������ ���� ��ȣ�� ���µ� ������ �Ѵٸ�
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