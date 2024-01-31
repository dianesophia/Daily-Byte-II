import java.util.*;

class ListNode{
  int val;
  ListNode next;
  
  ListNode(){}
  
  ListNode(int val){
    this.val = val;
    this.next = null;
  }
}

public class ReturnStartOfCycle{
  public static ListNode returnStartCycle(ListNode head){
     if(head == null || head.next == null)
       return null;
       
       ListNode slow = head;
       ListNode fast = head;
       
       while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
         
         if(slow == fast)
           break;
       }
       
       if(fast == null || fast.next == null)
         return null;
         
         slow = head;
         while(slow != fast){
            slow = slow.next;
            fast = fast.next;
         }
         
         return slow;

  }

  public static void main(String ...args){
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = sc.nextInt();
        ListNode list = new ListNode(0);
        ListNode current = list;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }
 current.next = list.next;

        System.out.println("Answer: " + returnStartCycle(list).val);

  }
}