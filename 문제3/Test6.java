package t;

class Complex {
    private double real;
    private double imag;

    public Complex(double real) {
        this.real = real;
        this.imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void print() {
        System.out.printf("%.1f + %.1fi\n", this.real, this.imag);
    }
}

public class Test6 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
