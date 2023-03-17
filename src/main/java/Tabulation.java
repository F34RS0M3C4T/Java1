import java.util.Scanner;
public class Tabulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, h, x;
        System.out.println("Введите границы табулирования: ");
        System.out.print("a = ");
        a = in.nextFloat();
        System.out.print("b = ");
        b = in.nextFloat();
        System.out.print("Шаг табуляции: ");
        h = in.nextFloat();
        while(h<=0){
            System.out.println("Ошибка. Шаг табуляции <= 0. Введите шаг табуляции заново");
            h = in.nextFloat();
        }
        if(b<a){
            x = a;
            a = b;
            b = x;
        }
        System.out.println("Аргумент Функция");
        while (a <= b) {
            System.out.println("x = " + a + " sin = " + Math.sin(a));
            a += h;
        }
    }

}//Табулирование функции sin(x)//


