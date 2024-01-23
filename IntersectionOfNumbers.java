import java.util.*;

public class IntersectionOfNumbers{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Map<Integer, Integer> map = new HashMap<>();
      //ArrayList<Integer> intersectNums = new ArrayList<>();
      Set<Integer> intersectNums = new HashSet<>();

      System.out.print("Enter the length of Array1: ");
      int n1 = sc.nextInt();
      int[] nums1 = new int[n1]; 
      
      for(int i = 0; i < n1; i++){
         System.out.print("Enter number: ");
         nums1[i] = sc.nextInt();
         map.put(nums1[i],i);
      }
     
      
      System.out.print("\nEnter the length of Array2: ");
      int n2 = sc.nextInt();
      int[] nums2 = new int[n2];
      
      for(int i = 0; i < n2; i++){
         System.out.print("Enter number: ");
         nums2[i] = sc.nextInt();
         if(map.containsKey(nums2[i])){
            intersectNums.add(nums2[i]);
         }
      }
      
      System.out.println("\nThe intersected numbers are : " + intersectNums);
   }
}