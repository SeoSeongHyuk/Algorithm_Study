import java.util.Scanner;

public class p11655 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = "";
		// System.out.println((int)'B' - (int)'O');
		// System.out.println((int)'a' - (int)'n');
		// System.out.println((int)'A' + " " + (int)'a');
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
				ch = rot13(ch);
			output += ch;
		}
		System.out.println(output);
	}
	
	public static char rot13(char ch) {
		if(ch >= 65 && ch <= 90) {
			if(ch + 13 > 90)
				ch = (char) ((int)ch + 13 - 90 + 64);
			else
				ch = (char) (ch + 13);
		}
		
		if(ch >= 97 && ch <= 122) {
			if(ch + 13 > 122)
				ch = (char) ((int)ch + 13 - 122 + 96);
			else
				ch = (char) (ch + 13);
		}
		
		return ch;
	}

}
