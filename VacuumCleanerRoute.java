import java.util.*;

public class VacuumCleanerRoute{
  public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the commands: ");
    String str = sc.nextLine();
    
    int leftRight = 0, upDown = 0;
    char[] commands = str.toCharArray();
    
    for(int i = 0; i <= commands.length-1; i++){
       if(commands[i] == 'L')
         leftRight++;
       else if(commands[i] == 'R')
         leftRight--;
         
       else if(commands[i] == 'U')
          upDown++;
       else if(commands[i] == 'D')
          upDown--;
    }
     
     System.out.println((upDown== 0 && leftRight == 0) ? "True" : "False");
  }
}