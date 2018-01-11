import java.util.Scanner;

public class p11719 {
	static int line = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String temp = "";
		
		while(scan.hasNextLine()) {
			temp = scan.nextLine();
			
			// ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷����
			if(!hasSpecial(temp)) {
				System.out.println("Ư�� ���� ");
				break;
			}
			
			// �� �ٿ� 100 ���ڸ� ���� ����
			if(temp.length() > 100) {
				System.out.println("���� �� �ʰ�");
				break;
			}
			
			line++;
			input += (temp + "\n");
		}
		System.out.println(input);
	}

	static boolean hasSpecial(String s) {
		char cmp;
		boolean flag = true;
		for(int i = 0; i < s.length(); i++) {
			cmp = s.charAt(i);
			if((cmp != 32 && cmp <= 47) || (cmp >= 58 && cmp <= 64) || (cmp >= 91 && cmp <= 96) || (cmp >= 123 && cmp >= 126)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
