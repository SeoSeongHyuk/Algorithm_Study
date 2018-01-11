/*
 * Call-by-Value �� Call-by-Reference �� ����
 * ���� ���� ��� �� �Լ��� ���� ���� ���ϴ����� ���� �˱�.
 * 
 */
import java.util.*;

public class Editor {
	public static Scanner sc = new Scanner(System.in);
	public static int cursor = 0;
	public static String text;
	
	public Editor(String text) {
		this.text = text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public static void InitCursor(String s) {
		cursor = s.length();
	}
	public static void MoveLeft() {
		if(cursor != 0) 
			cursor = cursor - 1;
	}
	public static void MoveRight(String s) {
		if(cursor != s.length())
			cursor = cursor + 1;
	}
	public static void Delete(Editor e) {
		if(cursor != 0){
			String temp = e.getText();
			temp = temp.substring(0, cursor - 1) + temp.substring(cursor);
			e.setText(temp);
			cursor = cursor - 1;
		}
	}
	public static void Add(Editor e, String c) {
		String temp = e.getText();
		temp = temp.substring(0,  cursor) + c + temp.substring(cursor);
		e.setText(temp);
		cursor = cursor + 1;
	}
	
	public static void main(String[] args) {
		text = sc.next();
		Editor e = new Editor(text);
		int order = sc.nextInt();
		String command = "";
		InitCursor(text);
		
		while(order > 0) {
			command = sc.next();
			if(command.equals("L")){
				MoveLeft();
			}
			else if(command.equals("D")) {
				MoveRight(text);
			}
			else if(command.equals("B")) {
				Delete(e);
			}
			else if(command.equals("P")) {
				String temp = sc.next();
				Add(e, temp);
			}
			order --;
		}
		System.out.println(text);
	}
}
