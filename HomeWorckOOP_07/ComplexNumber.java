package HomeWorckOOP_07;

public class ComplexNumber {
    private int a;
    private int b;

    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("%d+%di", a, b);
    }
}
