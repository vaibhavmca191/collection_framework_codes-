package Collection_HrishikeshSir;

import java.util.ArrayList;

public class ArrayList_Ex1 {

	public static void main(String[] args) {
		//Wrte a program to clone an
		//Array list to another array list
		
		ArrayList AL1 = new ArrayList();
		
		AL1.add(10);
		AL1.add(20);
		AL1.add(30);
		AL1.add(40);
		
		System.out.println("AL1: "+AL1);
		
		ArrayList AL2 = new ArrayList(AL1);
		
		System.out.println("AL2: "+AL2);
		

	}

}
