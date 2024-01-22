import java.util.*;
public class TwoSum{
  public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of elements in the array: ");
    int num = sc.nextInt();
    int[] number = new int[num];
    
    for(int i = 0; i < num; i++){
      System.out.print("Enter number: ");
      number[i] = sc.nextInt();
    }
    
    System.out.print("Enter the value of k: ");
    int target = sc.nextInt();
    int a = 0, b = 0;
    boolean ans = false;
  
    for(int i = 0; i< num; i++){
      for(int j = 1; j < num; j++){
         if(number[i] + number[j] == target){
         a = number[i];
         b = number[j];
            ans = true;
             break;
   
         }
      }
    }
    
  System.out.print(ans ? "True (" + a + " + " + b + " = " + target + ")" : "False");


    
  }
}