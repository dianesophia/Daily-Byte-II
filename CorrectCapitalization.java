import java.util.*;

public class CorrectCapitalization{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
    
      System.out.print("Enter a word: ");
      String word = sc.nextLine();
      boolean firstLetter = false;
      int  upperLetter = 0;
    
      char[] ch = word.toCharArray();
      for(int i = 1; i<= ch.length-1; i++){
         if(Character.isUpperCase(ch[i]))
            upperLetter++;
      }
    
      if(Character.isUpperCase(ch[0])){
         firstLetter = true;
      }
      
      System.out.println(firstLetter && upperLetter == 0 || !firstLetter && upperLetter == 0 || firstLetter && upperLetter == ch.length-1 ? "True" : "False");
   }
}