package ForException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class TreeSetExample {

//	private static final Object Object = null;

	public static void main(String[] args) {
		
	 //hash is applied on the objects added to the hashSet, so we can retrieve an element with O(1) complexity
	 HashSet h = new HashSet();
	 h.add(100);
	 h.add(910);
	 h.add(1020);
	 h.add(108);
	
	 
	 System.out.println(h);
	 Spliterator v1 =h.spliterator();
	 v1.forEachRemaining((data) -> System.out.println(data));
	 
	 LinkedHashSet h1 = new LinkedHashSet();
	 h1.add(100);
	 h1.add(90);
	 h1.add(1020);
	 h1.add(108);
	 //since it implements set, you cannot get the value
	 //using the position. 
	
	 System.out.println(h1);
	 
	 Object oct = Integer.valueOf(123);
	 for (Object object : h1) {
		System.out.println(object+ " "+ object.getClass());
	}
	 Iterator l1 = h1.iterator();
	 System.out.println(l1.getClass());
	 System.out.println(oct.getClass());
	 System.out.println(l1.getClass());
	 while(l1.hasNext()) {
		 System.out.println(l1.next());
		 System.out.println(l1.getClass());
//		 HashSet ll1 = (HashSet)(l1.next());
		 
	 }
	 
	 TreeSet n1 = new TreeSet();
	 n1.add(123);
	 n1.add(12);
	 n1.add(13);
	 n1.add(1232);
	 boolean containing = n1.contains(12);
	 Iterator l2 = n1.descendingIterator();
	 System.out.println(n1);
	 while(l2.hasNext()) System.out.println(l2.next());
	
	
	List arr = new ArrayList();
	arr.add(12);
	arr.add(2.123213);
	arr.add("sumith");
	
	arr.get(1);
	//since the objects in the list can be of any data type(int, double, String), we use Object class to represent them all 
	for (Object object : arr) {
		System.out.println(object);
	}
	
	
	CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
	cal.add(100);
	cal.add(200);
	cal.add(300);
	Iterator itr = cal.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		cal.add(400);
	}
	
	
	Vector vec = new Vector();
	
	// to add an element, we use the addElement instead of add 
	vec.addElement(12);
	vec.addElement(23);
	vec.addElement(34);
	vec.addElement(333);
	
	//used to remove the element
	vec.remove(0);
	
	//find the element at a specified index. just like get in collection class
	vec.elementAt(2);
	//gets the first element
	vec.firstElement();
	//gets the last element
	vec.lastElement();
	
	

	
	Stack stack = new Stack();
	stack.add(23);
	stack.add(33);
	stack.add(34);
	
	System.out.println("The capacity of the stack is "+stack.capacity());
	System.out.println("using the peek method "+stack.peek());
	System.out.println("using the pop method it removes the element and prints out "+stack.pop());
	System.out.println("Check if the stack is empty "+stack.empty());
	System.out.println("Check if the stack has the element, and gives the index of that obj "+stack.search(23));

}
}
