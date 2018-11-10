package Maxim;

public class task1 {
    public static void main(String[] args) {
        getRezult(2,4,5);
    }
    public static void getRezult(int a, int b, int c){
        int discr=b*b-4*a*c;
        double x1 = 0;
        double x2 = 0;
        if (discr>0) {
            x1= x1 +(-b+Math.sqrt(discr))/2*a;
            x2= x2+(-b-Math.sqrt(discr))/2*a;
        }
        if (discr==0) {
            x1=-b/2*a;
        }
        if (discr<0) {
            System.out.println("Нет решения");
        }
        System.out.println(x1+" "+x2);
    }
}
