package JavaPracticePrograms;

public class reverseString {

	public static void main(String[] args) {
		String st= "Tejas";
		  String revSt="";
		  for(int i=st.length()-1; i>=0; i--){
		    revSt= revSt+st.charAt(i);  
		  }
		  System.out.println(revSt);

	}

}
