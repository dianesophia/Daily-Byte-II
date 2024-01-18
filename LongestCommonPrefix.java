import java.util.*;

public class LongestCommonPrefix{
  public static void main(String ...args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of elements in the array: ");
     int num = sc.nextInt();
     String[] wordArray = new String[num];
     
     for(int i = 0; i < wordArray.length; i++){
       System.out.print("Enter word: ");
        wordArray[i] = sc.next();
     }
     
      
      String prefix = wordArray[0];
      for(int i = 1; i < wordArray.length; i++){
         while(wordArray[i].indexOf(prefix) != 0){
           prefix = prefix.substring(0, prefix.length()-1);
         }
      }
     System.out.print(prefix);
  }
}