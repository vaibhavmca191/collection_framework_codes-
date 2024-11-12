package Collection_HrishikeshSir;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_Prob {

	public static void main(String[] args) {
//write a program to
//iterate through all element in linked list
		
	LinkedList LL = new LinkedList();
	
	LL.addFirst(10);
	LL.addFirst(20);
	LL.addFirst(30);
	LL.addFirst(40);
	
	System.out.println(LL);
//	
//	Iterator i=LL.listIterator(2);//Iteration start
//	
//	while(i.hasNext())
//	{,
//		System.out.println(i.next());
//	}
	System.out.println();
	
	//decending iterator
   Iterator j=LL.descendingIterator();//Iteration start
	
	while(j.hasNext())
	{
		System.out.println(j.next());
	}
	
	
				
				

	}

}
