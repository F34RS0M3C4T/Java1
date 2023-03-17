import java.util.Scanner;
public class LinearEquations {

    public static void linearEquations(double a, double b, double c, double d, double e, double f) {
        if(a*d != c*b){
            double det = a*d - b*c;
            double detx = e*d - f*b;
            double dety = a*f - c*e;
            double x = detx/det, y = dety/det;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        else if((a == 0 && b == 0 && e != 0 || c == 0 && d == 0 && f != 0))
        {
            System.out.println("Система не имеет решений");
        }
// else if((a == 0 && c == 0 && b != 0 && d != 0 && e != 0 && f != 0) && ){
// System.out.println("Система не имеет решений");
// }
        else if(a*d == c*b && (a*f != c*e || b*f != e*d)){
            System.out.println("Система не имеет решений");
        }
        else if(a*d == c*b && a*f == c*e){
            System.out.println("Система имеет бесконечное множество решений");
        }
    }
    public static void main (String[]args){
        linearEquations(0, 0, 0, 0, 0, 0);
        System.out.println();
        linearEquations(0, 0, 0, 0, 0, 1);
        linearEquations(0, 0, 0, 0, 4, 1);
        linearEquations(1, 1, 2, 2, 2, 1);
        linearEquations(0, 1, 0, 1, 1, 3);
        linearEquations(1, 0, 1, 0, 2, 1);
        System.out.println();
        linearEquations(1, 2, 0, 0, 3, 0);
        linearEquations(1, 2, 2, 4, 2, 4);
        linearEquations(0, 1, 0, 2, 2, 4);
        linearEquations(1, 0, 3, 0, 2, 6);
        System.out.println();
        linearEquations(1, 2, 4, 5, 3, 6);
    }
}//Решение системы двух линейных уравнений с двумя неизвестными//

