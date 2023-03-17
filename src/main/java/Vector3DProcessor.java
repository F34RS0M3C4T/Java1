public class Vector3DProcessor {

    public static Vector3D addition(Vector3D vector1, Vector3D vector2){
        Vector3D sum = new Vector3D(vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY(), vector1.getZ() + vector2.getZ());
        return sum;
    }//Сумма двух векторов//

    public static Vector3D subtraction(Vector3D vector1, Vector3D vector2){
        Vector3D sub = new Vector3D(vector1.getX() - vector2.getX(), vector1.getY() - vector2.getY(), vector1.getZ() - vector2.getZ());
        return sub;
    }//Разность//

    public static double dotProduct(Vector3D vector1, Vector3D vector2){
        return vector1.getX()*vector2.getX() + vector1.getY()*vector2.getY() + vector1.getZ()*vector2.getZ();
    }//Скалярное произведение//

    /* Филиппов А.В. 31.05.2020 Комментарий не удалять.
     Не работает! См.тест.
    */
    public static Vector3D crossProduct(Vector3D vector1, Vector3D vector2){
        Vector3D cp = new Vector3D(vector1.getY()*vector2.getZ() - vector1.getZ()*vector2.getY(),
                vector1.getZ()*vector2.getX() - vector1.getX()*vector2.getZ(),
                vector1.getX()*vector2.getY() - vector1.getY()*vector2.getX());
        return cp;
    }//Векторное произведение//

    public static boolean isCollinear(Vector3D vector1, Vector3D vector2){
        return vector1.getX() * vector2.getY() == vector1.getY() * vector2.getX() &&
                vector1.getY()*vector2.getZ() == vector1.getZ()*vector2.getY();
    }//Коллнинеарность//
}
