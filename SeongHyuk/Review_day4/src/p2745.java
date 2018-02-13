import java.util.Scanner;

public class p2745 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int b = scan.nextInt();
		long output = 0;

		for(int i = input.length()-1; i >= 0; i--) {
			char tmp = input.charAt(i);
			int time = (input.length()-1) - i;
			
			long multi = 1;
			while(time-- > 0)
				multi *= b;
			
			if(tmp >= 65 && tmp <= 90)
				output += multi * Integer.parseInt((tmp-55)+"");
			else
				output += multi * Integer.parseInt(tmp+"");
		}
		
		System.out.println(output);

	}

}
