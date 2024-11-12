package Collection_HrishikeshSir;

import java.util.HashMap;

public class Hashmap_Ex01 {

	public static void main(String[] args) {
	//WPT Retrive but does not remove,
	//The First element of a Linked List
		
		HashMap<Integer,String>HM = new HashMap();
		
		HM.put(1, "STD1");
		HM.put(2, "STD2");
		HM.put(3, "STD3");
		HM.put(4, "STD4");
		HM.put(4, "STD5");
		
		System.out.println(HM);
		

	}

}
