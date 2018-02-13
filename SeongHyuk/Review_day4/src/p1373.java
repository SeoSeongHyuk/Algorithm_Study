import java.util.Scanner;

public class p1373 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String input = scan.next();
		
		// 처음 처리해 주는 부분을 잘못짯다.
		int check = 3-input.length() % 3;
		if(check != 3) {
			while(check-- > 0)
				input = "0"+input;
		}
		
		for(int i = input.length()-1; i >= 0; i-= 3) {
			int one = Integer.parseInt(input.charAt(i)+"") * 1;
			int two = Integer.parseInt(input.charAt(i-1)+"") * 2;
			int three = Integer.parseInt(input.charAt(i-2)+"")* 4;
			int temp = one + two + three;
		
			sb.append(temp);
		}
		
		System.out.println(sb.reverse().toString());

	}

}
