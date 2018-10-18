package array;

public class methodTask1 {
    public static void main(String[] args) {

        System.out.println(circleArea(10));

    }
    public static double rectangleArea(double width, double height) {
if (width <= 0 || height <= 0) {
    throw new IllegalArgumentException("Error");
}
        return  width*height;
    }
    public static double circleArea (double r){
        if (r <= 0) {
            throw new IllegalArgumentException("Enter positive radius");
        }
        return Math.PI*Math.pow(r, 2);
    }
}
