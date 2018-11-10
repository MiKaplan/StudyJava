package triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(2.0 , 4.4 ,6.1);
        Triangle triangleTwo = new Triangle(12.5 , 5.5 , 10.2);


        System.out.println(triangleOne.getArea());
        System.out.println(triangleTwo.getArea());
    }
}
