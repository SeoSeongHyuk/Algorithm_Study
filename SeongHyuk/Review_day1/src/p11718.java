import java.util.Scanner;

public class p11718 {
	static int charMax = 0;
	static int line = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String temp = "";
	
		// 아스키 코드 활용 문제 https://namu.wiki/w/%EC%95%84%EC%8A%A4%ED%82%A4%20%EC%BD%94%EB%93%9C
		while(scan.hasNextLine()) {
			temp = scan.nextLine();
			
			// 알파벳 소문자, 대문자, 공백, 숫자 검사 (특수문자)
			if(!checkSpecial(temp)) {
				System.out.println("특수문자 존재");
				break;
			}
			
			// 빈 줄은 주어지지 않는다.
			if(temp.length() == 0) {
				System.out.println("빈 줄이 주어짐");
				break;
			}
			
			// 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
			if(temp.charAt(0) == ' ' || temp.charAt(temp.length()-1) == ' ') {
				System.out.println("공백으로 시작하거나 공백으로 문장이 끝");
				break;
			}
			
			// 각 줄은 100글자를 넘지 않는다.
			if(temp.length() > 100) {
				System.out.println("한 줄에 100글자 초과");
				break;
			}
			
			// 입력은 최대 100줄
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
