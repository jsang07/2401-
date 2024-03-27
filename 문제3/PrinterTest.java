package t;

class Printer{
    int numOfPapers = 0;

    public void print(int num){
        System.out.println(numOfPapers - num);
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.numOfPapers = 100;
        printer.print(70);
    }
}
