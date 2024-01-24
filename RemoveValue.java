import java.util.*;

class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveValue{
  public static ListNode removeValue(ListNode list, int num){
    while(list != null && list.val == num){
       list = list.next;
    }
    
    ListNode current =  list;
    while(current != null && current.next != null){
      if(current.next.val == num)
         current.next = current.next.next;
       else
        current = current.next;
    }
    return list;
  }

   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter the number of elements in the list: ");
      int num = sc.nextInt();
      ListNode list = new ListNode();
      ListNode current = list;
      
      for(int i = 0; i < num; i++){
        System.out.print("Enter element: ");
        int val = sc.nextInt();
        current.next = new ListNode(val);
        current = current.next;
      }
        
      System.out.print("Enter the value of n: ");
      int n = sc.nextInt();
   
       ListNode updatedList = removeValue(list.next, n);
        System.out.print("Updated List: ");
        ListNode ct = updatedList;
        while (ct != null) {
            System.out.print(ct.val + " ");
            ct = ct.next;
        }

   }
}