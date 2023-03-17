public class Arithmetic {
    public static void arithmetic(double a, double b, double c){
        System.out.println(a*b*c);
        System.out.println((a + b + c)/3);
        double max = Math.max(c, Math.max(a, b));
        double min = Math.min(c, Math.min(a, b));
        System.out.println(min);
        if(a == max && b == min || a ==min && b == max){
            System.out.println(c);
        }
        else if(b == max && c == min || b ==min && c == max){
            System.out.println(a);
        }else
            System.out.println(b);
        System.out.println(max);
    }//Вывод произведения, средне арифметического, сами числа в порядке возрастания //

    public static void arithmeticInt(int a, int b, int c){
        System.out.println(a*b*c);
        System.out.println((double) (a + b + c)/3);
        double max = Math.max(c, Math.max(a, b));
        double min = Math.min(c, Math.min(a, b));
        System.out.println(min);
        if(a == max && b == min || a ==min && b == max){
            System.out.println(c);
        }
        else if(b == max && c == min || b ==min && c == max){
            System.out.println(a);
        }else
            System.out.println(b);
        System.out.println(max + "\n");
    }//то же самое, только для целых чисел//
}
