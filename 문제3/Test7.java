package t;

class GolfClub{
    private int num = 0;
    private String name = "";

    public GolfClub(){ this.num = 7;}
    public GolfClub(int num){
        this.num = num;
    }
    public GolfClub(String name){
        this.name = name;
    }

    public void print() {
        if (this.num > 0) {
            System.out.println(this.num + "번 아이언입니다");
        } else {
            System.out.println(this.name + "입니다");
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
