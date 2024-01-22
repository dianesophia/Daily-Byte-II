import java.util.*;

public class ValidAnagram{
  public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
    Map<Character, Integer> map = new HashMap<>();
    
    System.out.print("Enter the value of s: ");
    String sValue = sc.nextLine();
    
    System.out.print("Enter the value of t: ");
    String tValue = sc.nextLine();
    
    char[] s = sValue.toCharArray();
    char[] t = sValue.toCharArray();
    
    for(int i = 0; i <  s.length; i++){
      map.put(s[i], i);
    }
    
    int counter = 0;
    for(int i = 0; i < t.length; i++){
       if(map.containsKey(t[i]))
       counter++;
    }
    
  //  if(t.length == s.length){
  if(sValue.length() == tValue.length()){
       if(counter == s.length && counter == t.length)
       System.out.print("True");
       else
       System.out.print("False");
    }
    else
    System.out.print("False");
  }
}