import java.util.*;
public class ValidPalindrome{
  public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Word: ");
    String word = sc.nextLine();
    
    StringBuilder reverseWord = new StringBuilder(word).reverse();
    String newWord = reverseWord.toString();
    
    boolean ans = (word.equals(newWord)) ? true :  false; 
     
    System.out.print(ans);      
  }
}