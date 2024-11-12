package Collection_HrishikeshSir;

import java.util.ArrayList;
import java.util.LinkedList;

public class Convert_LL_To_AL {

	public static void main(String[] args) {
	// write a prog to convert a linked list to array list
     LinkedList LL = new LinkedList();
     
     LL.addFirst(10);
     LL.addFirst(20);
     LL.addFirst(30);
     LL.addFirst(40);
     
     System.out.println("LinkedList:"+LL);
     
     ArrayList AL = new ArrayList(LL);
     
     System.out.println("ArrayList: "+AL);
     

	}

}
