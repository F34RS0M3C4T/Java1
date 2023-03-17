public class Vector3DArray {
    private Vector3D[] vectorS;

    /* Филиппов А.В. 31.05.2020 Комментарий не удалять.
     Зачем хранить размер массива? Есть же vectorS.length
    */
//    private int size;

    public Vector3DArray(int size){
        this.vectorS = new Vector3D[size];
        for(int i = 0; i < size; i++){
            vectorS[i] = new Vector3D();
        }
//        this.size = size;
    }//Конструктор по размеру//

    public int getSize(){
        return vectorS.length;
    }

    public void changeVector(Vector3D vector, int i){
        this.vectorS[i].setX(vector.getX());
        this.vectorS[i].setY(vector.getY());
        this.vectorS[i].setZ(vector.getZ());
    }//Замена i-го элемента//

    public Vector3D sum(){
        Vector3D res = new Vector3D();
        for (Vector3D v: vectorS){
            res = Vector3DProcessor.addition(res, v);
        }
        return res;
    }////

    /* Филиппов А.В. 31.05.2020 Комментарий не удалять.
     Не работает! Если массив длины 0, то эта функция упадет.
     Массив длины 0 - это хорошая конструкция, которую можно использовать вместо null.
    */
    public double lengthOfLongestVector(){
        if (vectorS.length == 0) return 0;
        double len = vectorS[0].getLength();
        for(int i = 1; i < vectorS.length; i++){
            if (vectorS[i].getLength() > len) {
                len = vectorS[i].getLength();
            }
        }
        return len;
    }//наибольшая длина вектора//

    public int findVector(Vector3D needed){
        for(int i = 0; i < vectorS.length; i++){
            if(vectorS[i].equals(needed)){
                return i;
            }
        }
        return -1;
    }//поиск заданного вектора в массиве//



    public Vector3D linearCombination(int[] scalars){
        if(scalars.length == vectorS.length){
            double x = 0, y = 0, z = 0;
            for(int i = 0; i < vectorS.length; i++){
                x += vectorS[i].getX()*scalars[i];
                y += vectorS[i].getY()*scalars[i];
                z += vectorS[i].getZ()*scalars[i];
            }
            return new Vector3D(x, y, z);
        }
        else{
            return new Vector3D();
        }
    }//Линейная комбинация с заданными коэффициентами//

    public Point3D[] shift(Point3D P){
        Point3D[] pointS = new Point3D[vectorS.length];
        for(int i = 0; i < vectorS.length; i++){
            pointS[i] = new Point3D(P.getX() + vectorS[i].getX(),
                                    P.getY() + vectorS[i].getY(),
                                    P.getZ() + vectorS[i].getZ());
        }
        return pointS;
    }//вычисление массива точек//
}




























