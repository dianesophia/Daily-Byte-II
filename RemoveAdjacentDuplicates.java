import java.util.*;

public class RemoveAdjacentDuplicates{
  public static void main(String ...args){
    Set<Character> set = new HashSet<>();
    Stack<Character> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter characters: ");
    String chara = sc.nextLine();
    
    for(char c : chara.toCharArray()){
       if(!set.contains(c)){
          stack.push(c);
          set.add(c);
       }
       else if(set.contains(c)){
          stack.pop();
       }
    }
    
    StringBuilder result = new StringBuilder();
    for(char c : stack){
       result.append(c);
    }
    
    System.out.print(result.toString());
  }
}