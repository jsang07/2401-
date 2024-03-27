package t;

class Printer3{
    private int numOfPapers;
    private boolean duplex;

    public Printer3(int numOfPapers, boolean duplex){
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }
    public void print(int amount){
        if (duplex) {
            int printPages = (amount / 2)  + (amount % 2);
            if (numOfPapers >= printPages) {
                numOfPapers -= printPages;
                System.out.println("양면으로 " + printPages + "장 출력했습니다. 현재 " + numOfPapers + "장 남았습니다.");
            } else {
                System.out.println("용지가 부족합니다.");
            }
        } else {
            if (numOfPapers >= amount) {
                numOfPapers -= amount;
                System.out.println("단면으로 " + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남았습니다.");
            } else {
                System.out.println("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다 " + numOfPapers + "장만 출력합니다");
                numOfPapers = 0;
            }
        }
    }
    public boolean getDuplex(){
        return  duplex;
    }
    public void setDuplex(boolean duplex){
        this.duplex = duplex;
    }
}

public class PrinterDemo {
    public static void main(String[] args) {
        Printer3 p = new Printer3(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
