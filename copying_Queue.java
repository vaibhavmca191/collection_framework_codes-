package Collection_PriyankaMam;

import java.util.PriorityQueue;

public class copying_Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer>p1=new PriorityQueue<Integer>();
        p1.add(23);
        p1.add(78);
        p1.add(90);
        p1.add(1);
        System.out.println(p1);
        PriorityQueue<Integer>p2=new PriorityQueue<Integer>();
        p2.addAll(p1);
        System.out.println(p2);
	}

}
