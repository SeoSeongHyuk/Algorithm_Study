import java.util.*;

public class Pro11718 {
	static boolean checkSpecial(String s) {
		boolean flag = true;
		
		for(int i = 0; i < s.length(); i++) {
			//s.charAt(i)�� s���ڿ��� i��° ���� ��ȯ��. abcd���� charAt(1) = b.
			char k = s.charAt(i);
			//���ĺ�, ����, ���� �̿��� ���� ���
			if((k < 48) || (k >= 58 && k <= 64) || (k >= 91 && k <=96) || (k >= 123 && k <= 126)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		String temp = "";
		while(sc.hasNextLine()) {
			temp = sc.nextLine();
			
			//���ĺ�, ����, ���� �̿��� ���� �ִ� ���
			if(!checkSpecial(temp)) 
				break;
			//�� ���� 100���ڸ� �Ѵ� ���
			if(temp.length() > 100)
				break;
			//�������� ������ ���
			if(temp.charAt(0) == 32)
				break;
			//�������� ���� ���
			if(temp.charAt(temp.length()-1) == 32)
				break;
			
			result += temp + "\n";
		}
		System.out.println(result);
	}
}
