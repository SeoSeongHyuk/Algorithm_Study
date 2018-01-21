import java.util.*;

public class SentenceAnalyzation {
	public static Scanner sc = new Scanner(System.in);
	public static int [] array = new int[4];
	
	public static void NumofEachType(String s) {
		for(int i = 0; i < array.length; i++)
			array[i] = 0;

		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(temp >= 97 && temp <= 122)
				array[0] ++;
			else if(temp >= 65 && temp <= 90)
				array[1] ++;
			else if(temp >= 48 && temp <= 57)
				array[2] ++;
			else if(temp == 32)
				array[3] ++;
		}
		
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		String words = new String();
		
		while(sc.hasNextLine()) {
			/*
			���鵵 ���ڿ��� ���ԵǹǷ� nextLine()�� ���.
			next() ��� �� ������ �������� ���ڿ��� ������
			���� ���, This is String �̶�� ���ڿ��� This, is, String ���� ������ �����
			*/
			words = sc.nextLine();
			NumofEachType(words);
		}
	}

}
