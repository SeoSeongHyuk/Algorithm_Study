import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class p11656 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		ArrayList<String> set = new ArrayList<>();
		for(int i = 0; i < input.length(); i++) {
			set.add(input.substring(i, input.length()));
		}
		
		Collections.sort(set);
		
		Iterator iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
