package A4_Polymorphism;

public class Triangle extends TwoDimensionShape {

    private final double base;
    private final double height;
    private final double b;
    private final double c;
    private final double a;

    public Triangle(double base, double height, double a, double b, double c) {
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    double getArea() {
        return base * (height/2);
    }

    @Override
    double getPerimeter() {
        return a + b +c;
    }
}
