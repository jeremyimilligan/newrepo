package shapes;

public class shapetest {
    public static void main(String[] args) {
        triangle tri1 = new triangle(20,10,15, 20);
        System.out.println("Triangle Area: " + tri1.area() + " Triangle Perimeter: " + tri1.perimeter());

        square squ1 = new square(10);
        System.out.println("Square Area: " + squ1.findArea() + " Square Perimeter: " + squ1.findPerimeter());

    }
}
