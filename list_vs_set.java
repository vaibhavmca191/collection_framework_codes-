package Collection_HrishikeshSir;

import java.util.ArrayList;
import java.util.HashSet;

public class list_vs_set {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		//Array List Follows Insertion Order
		//Array List Allows Repetition
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(20);
		l1.add(null);
		l1.add(null);
		
		System.out.println("ArrayList"+l1);
		System.out.println();
		
		HashSet h1 =new HashSet();
		//HashSet Doesnt Followas Insertion Order
		//HashSet Doesnt Allowas Repetition
		//HashSet Allowas Single Null Value
		

	}

}
