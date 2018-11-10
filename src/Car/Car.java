package Car;

public class Car {
   private String color;
    private  double weight;
    private int year;
    private double velosity;

    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    public Car(){
        super();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVelosity(double velosity) {
        this.velosity = velosity;
    }
    //    public void setYear(int year){
//        this.year = year;
//    }



    public void beep(){
        System.out.println("BEEP-BEEP!!!");
    }
    public void acceleration (double a){
        velosity=velosity+a;
    }
    public void deceleration(double b){
        if(velosity-b>=0) velosity=velosity-b;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velosity=" + velosity +
                '}';
    }
}
