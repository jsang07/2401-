import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        System.out.println(q.poll());
        q.offer("app");
        System.out.println("바나나 추가했나요?" + q.offer("banana"));

        try {
            q.add("cherry");
        } catch (IllegalStateException e){

        }
        System.out.println("헤드 엿보기 : " + q.peek());

        String head = null;
        try {
            head = q.remove();
            System.out.println(head + "제거하기");
            System.out.println("새로운 헤드 : " + q.element());
        } catch (NoSuchElementException e){

        }

        head = q.poll();
        System.out.println(head + "제거하기");
        System.out.println("새로운 헤드 : " + q.peek());

        System.out.println("체리를 포함하고있나요? " + q.contains("cherry"));
        System.out.println("사과를 포함하고있나요? " + q.contains("app"));
    }


}
