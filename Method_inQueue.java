package Collection_PriyankaMam;

import java.util.PriorityQueue;

public class Method_inQueue {

	public static void main(String[] args) {
	PriorityQueue<Integer>p1=new PriorityQueue<Integer>();
	p1.add(23);
	p1.add(25);
	p1.add(222);
	p1.add(267);
 System.out.println(p1);
/* System.out.println(p1.size());
 p1.clear();
 System.out.println(p1);
// System.out.println("peek ="+p1.peek());
 //return null if queue is empty
 
 System.out.println("top ="+p1.element());
 //return exception if queue is empty
  * 
  */
 
 System.out.println("poll ="+p1.poll());
 //use to check top of queue and remove it
 //return null if queue is empty
 System.out.println(p1);
 
 System.out.println("remove ="+p1.remove());
 //use to check top of queue and remove it 
 //return exception if queue is empty
 System.out.println(p1);
 
 p1.remove(222);//use to remove perticular element
 System.out.println(p1);
 
 System.out.println(p1.contains(222));
 //use for search element
 
 PriorityQueue<Integer>p2=new PriorityQueue<Integer>();
 p2.addAll(p1);
 System.out.println(p1);
 
 System.out.println(p1.equals(p2));
 //use to check both queue are same or not
 
	}

}
