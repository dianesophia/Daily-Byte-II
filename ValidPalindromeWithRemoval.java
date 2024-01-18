import java.util.Scanner;

public class ValidPalindromeWithRemoval {
   public static void main(String... args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String word = sc.nextLine().toLowerCase();
   
      System.out.print(canBePalindrome(word) ? "True" : "False");
   }

   private static boolean canBePalindrome(String word) {
      int start = 0;
      int end = word.length() - 1;
   
      while (start < end) {
         if (word.charAt(start) != word.charAt(end)) {
            return isPalindrome(word, start + 1, end) || isPalindrome(word, start, end - 1);
         }
         start++;
         end--;  // Fix: Change end++ to end--
      }
   
      return true;
   }

   private static boolean isPalindrome(String word, int start, int end) {
      while (start < end) {
         if (word.charAt(start) != word.charAt(end)) {
            return false;
         }
         start++;
         end--;
      }
      return true;
   }
}
