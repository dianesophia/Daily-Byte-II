import java.util.*;

public class JewelsAndStones{
  public static void main(String ...args){
  Scanner sc = new Scanner(System.in);
     Map<Character, Integer> map = new HashMap<>();
     
     System.out.print("Enter jewels: ");
     String jewels = sc.nextLine();
     System.out.print("Enter stones: ");
     String stones = sc.nextLine();
     
     char[] j = jewels.toCharArray();
     char[] s = stones.toCharArray();
     
     for(int i = 0; i < j.length; i++){
        map.put(j[i], i);
     }
     
     int counter = 0;
     for(int i = 0; i< s.length; i++){
       if(map.containsKey(s[i]))
       counter++;
     }
     
     
     System.out.println(counter);
  }
}