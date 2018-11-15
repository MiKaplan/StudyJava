package vector3d;

public class Main {
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(3, 2,1);

        System.out.println("Vector sum = " + Vector3D.sum(vector1,vector2));
        System.out.println("Vector scalar multiply = " + Vector3D.scalarMultiply(vector1,vector2));
        System.out.println("Vector multiply = " + Vector3D.vectorMultiply(vector1,vector2));
    }
}
