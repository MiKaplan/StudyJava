package shape;

public class Square extends Shape {
    private Point a;
    private Point b;


    public Square(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    double getPerimetr() {
        double perimetr = 4*(Math.sqrt(Math.pow((a.getX()-b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
        return perimetr;
    }
    @Override
    double getArea(){
        double area = Math.pow((Math.sqrt(Math.pow((a.getX()-b.getX()), 2) + Math.pow((a.getY()-b.getY()), 2))), 2);
        return area;
    }

    @Override
    public String toString() {

        return "Square [a=" + a +  ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
    }
}


