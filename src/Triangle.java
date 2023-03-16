public class Triangle extends Shape {
    private double a = 1;
    private double b = 1;
    private double c = 1;

    public Triangle() {
    }

    public Triangle(String color, Boolean filled, double a, double b, double c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getPrimeter(){
        return a+b+c;
    }
    public double getArea(){
        double p = getPrimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
