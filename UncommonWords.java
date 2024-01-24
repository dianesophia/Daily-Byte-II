import java.util.*;

public class UncommonWords{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Map<String, Integer> map1 = new HashMap<>();
      Map<String, Integer> map2 = new HashMap<>();
      Set<String> set = new HashSet<>();
      
      System.out.print("Enter the first sentence :");
      String sentence1 = sc.nextLine();
      String[] s1 = sentence1.split(" ");
      
      for(int i = 0; i < s1.length; i++){
         map1.put(s1[i], i);
      }
      
      System.out.print("Enter the second sentence :");
      String sentence2 = sc.nextLine();
      String[] s2 = sentence2.split(" ");
      
      for(int i = 0; i < s2.length; i++){
         map2.put(s2[i], i);
      }
      
      
      for(int i = 0; i < s1.length; i++){
         if(!map2.containsKey(s1[i])){
            set.add(s1[i]);
         }
      }
      
      for(int i = 0; i < s2.length; i++){
         if(!map1.containsKey(s2[i])){
            set.add(s2[i]);
         }
      }
      
      System.out.print("The uncommon words are : " + set);
   }
}

/*
import java.util.*;

public class UncommonWords {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordOccurrences = new HashMap<>();
        Set<String> uncommonWords = new HashSet<>();

        System.out.print("Enter the first sentence: ");
        String sentence1 = sc.nextLine();
        String[] s1 = sentence1.split(" ");

        System.out.print("Enter the second sentence: ");
        String sentence2 = sc.nextLine();
        String[] s2 = sentence2.split(" ");

        // Count occurrences of words in both sentences
        for (String word : s1) {
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
        }

        for (String word : s2) {
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
        }

        // Find uncommon words
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        System.out.println("The uncommon words are: " + uncommonWords);
    }
}

*/