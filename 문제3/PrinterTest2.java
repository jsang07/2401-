package t;

class Printer2 {
    private int paperCount;

    public Printer2(int paperCount) {
        this.paperCount = paperCount;
    }

    public void print(int pages) {
        if (paperCount == 0) {
            System.out.println("용지가 없습니다.");
            return;
        }
        if (pages > paperCount) {
            System.out.println("모두 출력하려면 용지가 " + (pages - paperCount) + "매 부족합니다. " + paperCount + "장만 출력합니다.");
            paperCount = 0;
        } else {
            paperCount -= pages;
            System.out.println(pages + "장 출력했습니다. 현재 " + paperCount + "장 남아 있습니다.");
        }
    }
}

public class PrinterTest2 {
    public static void main(String[] args) {
        Printer2 p = new Printer2(10);
        p.print(2);
        p.print(20);
        p.print(10);
    }
}
