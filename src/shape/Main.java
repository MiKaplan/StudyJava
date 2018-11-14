package shape;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 4, 6, 2);
        Square square = new Square(point);
        Circle circle = new Circle(point);
        System.out.println(square);
        System.out.println(circle);
    }
}
