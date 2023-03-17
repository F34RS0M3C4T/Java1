import java.util.Objects;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(){
        x = 0;
        y = 0;
        z = 0;
    }//Конструктор по координатам//

    public Point3D(double _x, double _y, double _z){
        x = _x;
        y = _y;
        z = _z;
    }//Конструктор по параметрам//
    //Дальше будут геттеры и сеттеры//
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }

    public void showPoint(){
        System.out.println(x + " " + y + " " + z);
    }//Вывод точки на консоль//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 &&
                Double.compare(point3D.y, y) == 0 &&
                Double.compare(point3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
