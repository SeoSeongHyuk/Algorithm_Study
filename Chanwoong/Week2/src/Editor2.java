import java.util.*;

public class Editor2 {
	public static Scanner sc = new Scanner(System.in);
	public static int cursor = 0;
	
	public static void main(String[] args) {
		String text = sc.next();
		cursor = text.length();
		int order = sc.nextInt();
		String command;
		
		while(order > 0) {
			command = sc.next();
			if(command.equals("L") && cursor != 0) {
				cursor = cursor - 1;
			}
			else if(command.equals("D") && cursor != text.length()) {
				cursor = cursor + 1;
			}
			else if(command.equals("B") && cursor != 0) {
				text = text.substring(0, cursor - 1) + text.substring(cursor);
				cursor = cursor - 1;
			}
			else if(command.equals("P")) {
				String temp = sc.next();
				text = text.substring(0,cursor) + temp + text.substring(cursor);
				cursor = cursor + 1;
			}
			order = order - 1;
		}
		System.out.println(text);
	}
}
