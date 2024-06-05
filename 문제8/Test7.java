package test;
class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}
public class Test7 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(100);
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}
