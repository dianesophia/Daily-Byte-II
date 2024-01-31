import java.util.*;

public class CompareKeystrokes {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        System.out.print("Enter first Character: ");
        String s = sc.nextLine();
        System.out.print("Enter Second Character: ");
        String t = sc.nextLine();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack1.push(c);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }
        String ns = stack1.toString();

        for (char c : t.toCharArray()) {
            if (c != '#') {
                stack2.push(c);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }
        String nt = stack2.toString();

        System.out.print(ns.equals(nt) ? "True" : "False");
    }
}
