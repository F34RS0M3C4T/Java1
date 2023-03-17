import java.util.Objects;

public class Vector3D {
    private double x, y, z;

    public Vector3D(){
        x = 0;
        y = 0;
        z = 0;
    }//Конструктор по координатам//

    public Vector3D(Vector3D other){
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }//Конструктор копирования//

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }//По параметрам//

    public Vector3D(Point3D firstPoint, Point3D secondPoint){
        this.x = secondPoint.getX() - firstPoint.getX();
        this.y = secondPoint.getY() - firstPoint.getY();
        this.z = secondPoint.getZ() - firstPoint.getZ();
    }
    //Геттеры, сеттеры//
    public double getX(){ return x; }
    public double getY() { return y; }
    public double getZ(){ return z; }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }

    public double getLength(){
        return Math.sqrt(x*x + y*y + z*z);
    }
    //Длина вектора//

    public void showVector(){
        System.out.println(x + " " + y + " " + z);
    }
    //Вывод вектора//

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(vector3D.x, x) == 0 &&
                Double.compare(vector3D.y, y) == 0 &&
                Double.compare(vector3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
