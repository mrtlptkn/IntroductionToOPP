package A4_Polymorphism;

public class PolymorphismMain {

    public static void main(String[] args) {

        TwoDimensionShape t = new Rectangle(5, 10);
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());


        TwoDimensionShape t1 = new Square(5);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Area: " + t1.getArea());

        TwoDimensionShape u1 = new Triangle(5, 10, 5, 10, 15);
        System.out.println("Perimeter: " + u1.getPerimeter());
        System.out.println("Area: " + u1.getArea());


        // Not: Somut olan nesneler newlenmeli, somut olan düşnece gibi, iki boyutlu şekil gibi nesneler newlenmemeli. instance alınmamalıdır.


//        TwoDimensionShape t2 = new TwoDimensionShape();
//        System.out.println("Perimeter: " + t2.getPerimeter());
//        System.out.println("Area: " + t2.getArea());


    }
}
