package JavaPracticePrograms;

import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		int[] a= {1,3,5,8,0,1,0};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i:a) {
			list.add(i);
		}
		System.out.println(list);
		
	
	//Moving all zero to end
	for(int i=0;i<list.size();i++) {
		if(list.get(i)==0) {
			list.remove(i);
			list.add(0);
		}
	}
	System.out.println(list);

}
}
