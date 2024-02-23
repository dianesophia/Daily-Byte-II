import java.util.*;

public class Fizzbuzz{
  public static void main(String...args){
    Scanner sc = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    
    
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    
    for(int i = 1; i <= num; i++){
       if(i % 3 == 0 && i % 5 == 0)
          list.add("FizzBuzz");
       else if(i % 3 == 0)
          list.add("Fizz");
       else if(i % 5 == 0)
          list.add("Buzz");
        else if(i % 3 != 0 && i % 5 != 0)
          list.add(String.valueOf(i));
    }
       String[] listArray = list.toArray(new String[0]);
       System.out.print(Arrays.toString(listArray));
  }
}