package Collection_HrishikeshSir;

import java.util.LinkedList;

public class Peek_method {

	public static void main(String[] args) {
//write a program to retrive
		
		LinkedList L1 = new LinkedList();
		
		L1.addFirst(10);
		L1.addFirst(20);
		L1.addFirst(30);
		L1.addFirst(40);
		
		System.out.println(L1);
		
		System.out.println(L1.peek());
		System.out.println(L1.peekFirst());
		System.out.println(L1.peekLast());
		
		

	}

}
