package shape;

public class Square extends Shape {
    private Point a;


    public Square(Point a) {
        this.a = a;
    }
    public Square(){
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }


    @Override
    double getPerimetr() {
        double perimetr = 4*(Math.sqrt(Math.pow((a.getX1()-a.getX2()), 2) + Math.pow((a.getY1()-a.getY2()), 2)));
        return perimetr;
    }
    @Override
    double getArea(){
        double area = Math.pow((Math.sqrt(Math.pow((a.getX1()-a.getX2()), 2) + Math.pow((a.getY1()-a.getY2()), 2))), 2);
        return area;
    }

    @Override
    public String toString() {

        return "Square [a=" + a +  ", getPerimetr()=" + getPerimetr() + ", getArea()=" + getArea() + "]";
    }
}


