package Collection_HrishikeshSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_ex {

	public static void main(String[] args) {
		LinkedList LL1 = new LinkedList();
		
		LL1.add(10);
		LL1.offer(50);
		
		System.out.println(LL1);
		System.out.println();
		
		
		ArrayList A1 = new ArrayList();
		A1.add(50);
		A1.add(30);
		A1.add(10);
		A1.add(40);
		A1.add(20);
		
		System.out.println(A1);
		
		Collections.sort(A1);
		System.out.println(A1);

	}

}
