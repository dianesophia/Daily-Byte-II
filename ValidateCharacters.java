import java.util.*;

public class ValidateCharacters{
  public static void main(String ...args){
     Stack<Character> stack = new Stack<>();
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter characters: ");
     String charac = sc.nextLine();
     
     for(char c : charac.toCharArray()){
       if(c == '(' || c == '{' || c == '[')
          stack.push(c);
       else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
          stack.pop();
       else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
          stack.pop();
       else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
          stack.pop();
     }
     
     System.out.print(stack.isEmpty() ? "True" : "False");
     
  }
}