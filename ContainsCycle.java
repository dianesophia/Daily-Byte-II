import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        next = null;
        val = x;
    }
}

public class ContainsCycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String... args) {
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

        // Creating a cycle by connecting the last node to a previous node in the list
        ListNode lastNode = list;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        // Connecting the last node to the second node in the list
        lastNode.next = list.next;

        System.out.println("Answer: " + hasCycle(list));
    }
}
