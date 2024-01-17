import java.util.*;

public class ReverseString{
  /*public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    String reverseString = "";
    
    char[] ch = str.toCharArray();
    for(int i = ch.length-1; i >=  0; i--){
       reverseString += ch[i];
    }
    System.out.println(reverseString);
  
  }*/
  
  // other solution
  public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
    String str = sc.nextLine();
    
    StringBuilder reverseString = new StringBuilder(str).reverse();
    System.out.println(reverseString);
    
  }
} 