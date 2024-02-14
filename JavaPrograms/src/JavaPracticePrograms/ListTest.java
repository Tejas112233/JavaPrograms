package JavaPracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Tejas");
		list.add("Mukund");
		list.add("Abc");
		System.out.println("print the ArrayList- "+ list);
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addAll(list);
		System.out.println("Print the linked list- "+ linkedList);
		Iterator itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
