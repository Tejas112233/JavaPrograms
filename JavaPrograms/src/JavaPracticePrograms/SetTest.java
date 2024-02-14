package JavaPracticePrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Tejas");
		set.add("test1");
		set.add("test2");
		set.add("Tejas");
		System.out.println("Set- "+ set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
