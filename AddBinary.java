import java.util.*;
import java.math.BigInteger;

public class AddBinary{
  public static void main(String ...args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter first binary: ");
    String str1 = sc.nextLine();
    
    System.out.print("Enter second binary: ");
    String str2 = sc.nextLine();
    
    
    BigInteger num1 = new BigInteger(str1,2);
    BigInteger num2 = new BigInteger(str2,2);
    
    BigInteger sum = num1.add(num2);
    System.out.println(sum.toString(2));
  }
}

/*
import java.util.*;

public class AddBinary {
   public static void main(String... args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first binary: ");
      String b1 = sc.nextLine();
      System.out.print("Enter the second binary: ");
      String b2 = sc.nextLine();

      StringBuilder sb = new StringBuilder();
      int carry = 0;
      int i = b1.length() - 1;
      int j = b2.length() - 1;

      while (i >= 0 || j >= 0) {
         int sum = carry;

         if (i >= 0) {
            sum += b1.charAt(i) - '0';
            i--;
         }

         if (j >= 0) {
            sum += b2.charAt(j) - '0';
            j--;
         }

         sb.append(sum % 2);
         carry = sum / 2;
      }

      if (carry != 0)
         sb.append(carry);

      System.out.println(sb.reverse().toString());
   }
}

*/