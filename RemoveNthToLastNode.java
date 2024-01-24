import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthToLastNode {
  /*  public static ListNode removeElement(ListNode list, int num) {
        int counter = 0;
        ListNode temp = new ListNode(0);
        temp.next = list;
        ListNode current = temp;

        while (list != null) {
            if (counter == num) {
                current.next = current.next.next; 
            }

            current = current.next;
            list = list.next;
            counter++;
        }

        return temp.next;
    }*/
    
     public static ListNode removeElement(ListNode list, int num) {
        ListNode dummy = new ListNode(0);
        dummy.next = list;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer ahead by num + 1 steps
        for (int i = 0; i <= num; i++) {
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth-to-last node by updating the 'next' pointer of the previous node
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int num = sc.nextInt();
        ListNode list = new ListNode();
        ListNode current = list;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter element: ");
            int val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        ListNode updatedList = removeElement(list.next, n);
        System.out.print("Updated List: ");
        ListNode ct = updatedList;
        while (ct != null) {
            System.out.print(ct.val + " ");
            ct = ct.next;
        }
    }
}
