import java.util.Scanner;

public class p11718 {
	static int charMax = 0;
	static int line = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String temp = "";
	
		// �ƽ�Ű �ڵ� Ȱ�� ���� https://namu.wiki/w/%EC%95%84%EC%8A%A4%ED%82%A4%20%EC%BD%94%EB%93%9C
		while(scan.hasNextLine()) {
			temp = scan.nextLine();
			
			// ���ĺ� �ҹ���, �빮��, ����, ���� �˻� (Ư������)
			if(!checkSpecial(temp)) {
				System.out.println("Ư������ ����");
				break;
			}
			
			// �� ���� �־����� �ʴ´�.
			if(temp.length() == 0) {
				System.out.println("�� ���� �־���");
				break;
			}
			
			// �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.
			if(temp.charAt(0) == ' ' || temp.charAt(temp.length()-1) == ' ') {
				System.out.println("�������� �����ϰų� �������� ������ ��");
				break;
			}
			
			// �� ���� 100���ڸ� ���� �ʴ´�.
			if(temp.length() > 100) {
				System.out.println("�� �ٿ� 100���� �ʰ�");
				break;
			}
			
			// �Է��� �ִ� 100��
			line++;
			
			input += (temp + "\n");
		}
		
		System.out.println(input);
	}
	
	static boolean checkSpecial(String s) {
		boolean flag = true;
		
		for(int i = 0; i < s.length(); i++) {
			char cmp = s.charAt(i);
			if((cmp != 32 && cmp < 48) || (cmp >= 58 && cmp <= 64) || (cmp >= 91 && cmp <=96) || (cmp >= 123 && cmp <= 126)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
