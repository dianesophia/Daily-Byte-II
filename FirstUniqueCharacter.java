import java.util.*;

public class FirstUniqueCharacter{
  public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
    Map<Character, Integer> map = new HashMap<>();
    
    System.out.print("Enter String: ");
    String str = sc.nextLine();
    
    char[] s = str.toCharArray();
    for(int i = 0; i < s.length; i++){
       if(map.containsKey(s[i]))
          map.put(s[i], map.get(s[i]) + 1);
       else
          map.put(s[i],1);
    }
    
    int uniqueIndex = -1;
    
    for(int i = 0; i < s.length; i++){
      if(map.get(s[i]) == 1){
        uniqueIndex = i;
        break;
       }
    }
    
    System.out.print(uniqueIndex == -1 ? "No unique character" : "First unique character is " + uniqueIndex);
  }
}

// other solution

/*
import java.util.*;;

public class FirstUnqueCharacter{
   public static void main(String...args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the word:");
      String word = sc.nextLine();
    
      int[] freq = new int[26];
    
      for(char ch : word.toCharArray()){
         freq[ch - 'a']++;
      } 
      for(int i = 0; i < word.length(); i++){
         if(freq[word.charAt(i) - 'a'] == 1){
            System.out.println("The first unique character : " + i);
            System.exit(0);
         }
         
      }
    
      System.out.println("There is no unique character");
   }
}
*/



