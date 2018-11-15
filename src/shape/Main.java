package shape;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(5, 1);
        Square square = new Square(a, b);
        Circle circle = new Circle(a, b);
        System.out.println(square);
        System.out.println(circle);
    }
}
