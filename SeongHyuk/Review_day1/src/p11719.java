import java.util.Scanner;

public class p11719 {
	static int line = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String temp = "";
		
		while(scan.hasNextLine()) {
			temp = scan.nextLine();
			
			// 알파벳 소문자, 대문자, 공백, 숫자로만 이루어짐
			if(!hasSpecial(temp)) {
				System.out.println("특수 문자 ");
				break;
			}
			
			// 각 줄에 100 글자를 넘지 않음
			if(temp.length() > 100) {
				System.out.println("글자 수 초과");
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
