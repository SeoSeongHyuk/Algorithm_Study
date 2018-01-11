import java.util.Scanner;

public class p10953 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		scan.nextLine();
		String a = scan.nextLine();
		// String input = "";
		// int a = 0, b = 0;
		
		/*
		 * 차이점 중요
		 * next()는 개행문자, 공백은 무시하고 문자를 입력받는다.
		 * nextLine()은 한 줄 단위로 입력받기 때문에 개행문자도 한 줄로 인식한다.
		 */
		//scan.nextLine();
		/*
		while(t-- > 0) {	
			//input = scan.nextLine();
			input = scan.next();
			//System.out.println(input.length());
			a = Integer.parseInt(input.charAt(0)+"");
			b = Integer.parseInt(input.charAt(2)+"");
			System.out.println(a + b);
		}
		*/

	}

}
