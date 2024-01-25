import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class FindMiddleElement {

    public static ListNode findMiddle(ListNode list) {
        ListNode slow = list;
        ListNode fast = list.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = sc.nextInt();
        ListNode list = null;
        ListNode current = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int val = sc.nextInt();
            if (list == null) {
                list = new ListNode(val);
                current = list;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }
    
      
        if (list != null) {
            System.out.print("The middle element in the Linked list is " + findMiddle(list).val);
        } else {
            System.out.print("The list is empty.");
        }
    }
}
