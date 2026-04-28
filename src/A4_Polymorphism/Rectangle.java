package A4_Polymorphism;

public class Rectangle extends  TwoDimensionShape {

    // final tipi kullandığımız için sadece contructor aşamasında değer set edebildik.
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        // width=5; final tanımlandığı içn set edilemez
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double getPerimeter() {
        return (2* height) + (2 * width);
    }

    @Override
    double getArea() {
        return width * height;
    }
}
