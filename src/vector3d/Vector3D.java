package vector3d;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D(){
        super();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static Vector3D sum(Vector3D vector1, Vector3D vector2){
        Vector3D vector3 = new Vector3D();
        vector3.setX(vector1.getX()+vector2.getX());
        vector3.setY(vector1.getY()+vector2.getY());
        vector3.setZ(vector1.getZ()+vector2.getZ());
        return vector3;
    }
    public static double scalarMultiply(Vector3D vector1, Vector3D vector2){
        double scalar;
        scalar = vector1.getX()*vector2.getX() + vector1.getY()*vector2.getY() + vector1.getZ()*vector2.getZ();
        return scalar;
    }

    public static Vector3D vectorMultiply(Vector3D vector1, Vector3D vector2){
        Vector3D vector3 = new Vector3D();
        vector3.setX(vector1.getY()*vector2.getZ() - vector1.getZ()*vector2.getY());
        vector3.setY(vector1.getZ()*vector2.getX() - vector1.getX()*vector2.getZ());
        vector3.setZ(vector1.getX()*vector2.getY() - vector1.getY()*vector2.getX());
        return vector3;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
