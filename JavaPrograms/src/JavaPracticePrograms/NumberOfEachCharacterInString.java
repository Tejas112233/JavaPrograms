package JavaPracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class NumberOfEachCharacterInString {

	public static void main(String[] args) {
		Map < Character, Integer > map = new HashMap < Character, Integer > ();
		String st = "Tejass";

		for (int i = 0; i < st.length (); i++)
		  {
			if (map.containsKey (st.charAt (i)) == true)
			  {
				map.put (st.charAt (i), map.get (st.charAt (i)) + 1);
			  }
			else
			  {
				map.put (st.charAt (i), 1);
			  }
		  }
		System.out.println (map);
	  }

	}


