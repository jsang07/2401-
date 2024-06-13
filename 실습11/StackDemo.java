import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();

        s1.push("apple");
        s1.push("banana");
        s1.push("cherry");

        System.out.println(s1.peek());

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        Stack<Integer> s2 = new Stack<>();
        s2.add(10);
        s2.add(20);
        s2.add(1, 100);

        for (Integer i : s2) {
            System.out.print(i + " ");
        }
        System.out.println();

        while (!s2.empty())
            System.out.println(s2.pop() + " ");
    }
}
