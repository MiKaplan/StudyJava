package shape;

public class Circle extends Shape{
    private Point a;

    public Circle(Point a) {
        this.a = a;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }
    @Override
    double getPerimetr(){
        double perimetr = 2 * Math.PI * (Math.sqrt(Math.pow((a.getX1()-a.getX2()), 2) + Math.pow((a.getY1()-a.getY2()), 2)));
        return perimetr;
    }
    @Override
    double getArea(){
        double area = Math.PI*Math.pow((Math.sqrt(Math.pow((a.getX1()-a.getX2()), 2) + Math.pow((a.getY1()-a.getY2()), 2))), 2);
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" + "a=" + a + ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + '}';
    }
}
