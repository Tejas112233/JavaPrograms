package JavaPracticePrograms;

public class numberOfCharacterDigit {

	public static void main(String[] args) {
		String st= "Tejas1234 ";
		  int digit=0;
		  int letter =0;
		  int specialCharacter=0;
		  int upperCase=0;
		  
		  for(Character ch: st.toCharArray()){
		      if(Character.isDigit(ch)){
		          digit++;
		      }
		      else if(Character.isLetter(ch)){
		          letter++;
		          if(Character.isUpperCase(ch)){
		              upperCase++;
		          }
		      }
		      else{
		          specialCharacter++;
		      }
		      
		  } 
		  System.out.println("digit- "+digit);
		  System.out.println("letter- "+letter);
		  System.out.println("specialCharacter- "+specialCharacter);
		  System.out.println("upperCase- "+upperCase);


	}

}
