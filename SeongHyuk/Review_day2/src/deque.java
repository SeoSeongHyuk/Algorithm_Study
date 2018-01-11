import java.util.ArrayDeque;
import java.util.Deque;

public class deque {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addLast(5);
		
		System.out.println(deque.size());
		System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());
	}

}
