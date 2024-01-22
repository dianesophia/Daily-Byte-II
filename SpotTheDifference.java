import java.util.*;

public class SpotTheDifference{
  public static void main(String ...args){
     Scanner sc = new Scanner(System.in);
     Map<Character, Integer> map = new HashMap<>();
     
     System.out.print("Enter the value of s: ");
     String sValue = sc.nextLine();
     System.out.print("Enter the value of t: ");
     String tValue = sc.nextLine();
     
     char[] s = sValue.toCharArray();
     char[] t = tValue.toCharArray();
     char ans = '\u0000';
     
     for(int i = 0; i < s.length; i++){
        map.put(s[i], map.getOrDefault(s[i],0) + 1);
     }
     
     for(int i = 0; i < t.length; i++){
        if(!map.containsKey(t[i]))
          ans = t[i];
     }
     
     System.out.print(ans != '\u0000' ? "The unique value is " + ans : "There is no unique character");
  }
}