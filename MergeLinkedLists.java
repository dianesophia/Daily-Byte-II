import java.util.*;

class ListNode{
   int val;
   ListNode next;
   
   ListNode(){}
     
   ListNode(int val){
      this.val = val;
   }
  
   ListNode(int val, ListNode next){
      this.val = val;
      this.next = next;
   }
}

public class MergeLinkedLists{
   public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
     ListNode temp = new ListNode(0);
     ListNode current = temp;
     
     while(list1 != null && list2 != null){
        if(list1.val < list2.val){
          current.next = list1;
          list1 = list1.next;
        }else{
           current.next = list2;
           list2 = list2.next;
        }
        current = current.next;
     }
     
     if(list1 != null){
       current.next = list1;
     }else{
       current.next = list2;
     }
     
     return temp.next;
   }
   
   
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number of elements in the first list: ");
      int n1 = sc.nextInt();
      ListNode list1 = new ListNode();
      ListNode current1 = list1;
      
      for(int i = 0; i < n1; i++){
        System.out.print("Enter element: ");
        int val = sc.nextInt();
        current1.next = new ListNode(val);
        current1 = current1.next;
      }
      
      System.out.print("Enter the number of elements in the second list: ");
      int n2 = sc.nextInt();
      ListNode list2 = new ListNode();
      ListNode current2 = list2;
      
      for(int i = 0; i < n2; i++){
         System.out.print("Enter element: ");
         int val= sc.nextInt();
         current2.next = new ListNode(val);
         current2 = current2.next;
      }
      
      ListNode mergedList = mergeTwoLists(list1.next, list2.next);
      
      System.out.println("Merge sorted list: ");
      ListNode current = mergedList;
      while(current != null){
         System.out.print(current.val + " ");
         current = current.next;
      }
   }
}