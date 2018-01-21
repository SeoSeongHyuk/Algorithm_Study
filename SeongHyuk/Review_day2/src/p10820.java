import java.util.Scanner;

public class p10820 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.println((int)'A' + "~" + (int)'Z');
		// System.out.println((int)' ');
		// System.out.println((int)'0' + "~" + (int)'9');
		// System.out.println((int)'a' + "~" + (int)'z');
		while(scan.hasNextLine()) {
			String input = scan.nextLine();
			int[] output = check(input);
			
			for(int i = 0; i < output.length; i++) {
				System.out.print(output[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[] check(String input) {
		int[] answer = new int[4];
		
		for(int i = 0; i < input.length(); i++) {
			int tar = input.charAt(i);

			if(tar == 32)
				answer[3]++;
			else if(tar >= 65 && tar <= 90)
				answer[1]++;
			else if(tar >= 97 && tar <= 122)
				answer[0]++;
			else if(tar >= 48 && tar <= 57)
				answer[2]++;
			else {
				
			}
		}
		return answer;
	}
}
