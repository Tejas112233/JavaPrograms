package JavaPracticePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "One");
		map.put(2,"Two");
		map.put(3, "Three");
		System.out.println("map- "+map);
		System.out.println("Kyes- "+map.keySet());
		System.out.println("Values- "+ map.values());
		System.out.println("Entry set- "+map.entrySet());
		Set<String> s = new HashSet<String>();
		s.addAll(map.values());
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
