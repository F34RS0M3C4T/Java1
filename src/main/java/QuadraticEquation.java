public class QuadraticEquation {
    public static void QEquation(double a, double b, double c){
        if(a == 0){
            System.out.println("Уравнение не квадратное");
        }
        else{
            double d = b*b - 4*a*c;
            if(d > 0){
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
            }
            else if(d == 0){
                double x = (-b)/(2*a);
                System.out.println("x = " + x);
            }
            else{
                System.out.println("Корней нет");
            }
        }
    }//Решение квадратного уравнения//
}