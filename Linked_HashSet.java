package Collection_HrishikeshSir;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
	LinkedHashSet h1 = new LinkedHashSet();
	//LinkedHashSet Follows Insertion Order
	//LinkedHashSet  Does Not Follows Repetition
	
	h1.add(10);
	h1.add(20);
	h1.add(30);
	h1.add(40);
	//assign duplicates ele but not display
	h1.add(10);
	h1.add(20);
	h1.add(30);
	h1.add(40);
	System.out.println("HashSet:"+h1);

	}

}
