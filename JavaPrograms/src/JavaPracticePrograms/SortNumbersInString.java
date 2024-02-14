package JavaPracticePrograms;

import java.util.*;

public class SortNumbersInString {

	public static void main(String[] args) {
		String st= "11 ,23,12,11";
		String[] stArray= st.split(",");
		List<Integer> list= new ArrayList<Integer>();
		for(String s: stArray){
		   list.add(Integer.parseInt(s.trim())); 
		}
		Collections.sort(list);
		System.out.println(list);

	}

}
