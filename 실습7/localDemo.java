public class localDemo {
    public static void main(String[] args) {
        class Eagele extends Bird{
            @Override
            public void move() {
                System.out.println("독수리가 난다~~~.");
            }
        }

        Bird e = new Bird();
        e.move();
    }
}
