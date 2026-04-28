package A4_Polymorphism;

public class Square extends TwoDimensionShape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}
