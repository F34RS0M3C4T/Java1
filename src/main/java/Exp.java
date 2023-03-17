import org.apache.commons.math3.util.Precision;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Exp {

    /* Филиппов А.В. 31.05.2020 Комментарий не удалять.
     Не работает! Заменить BigDecimal на double и написать тесты, а то не очень понятно как проверять
    */
    public static double taylorSeries(double x, double acc) throws Exception {
        if (acc < 0) {
            throw new Exception("Accuracy is less then 0");
        }

//        BigDecimal sum = BigDecimal.ONE,nextSum = BigDecimal.ONE;
//        for(int i = 1; nextSum.abs().compareTo(new BigDecimal(acc)) >= 0; ++i){
//            nextSum = nextSum.multiply(new BigDecimal(x / i));
//            sum = sum.add(nextSum);
//        }

        double sum = 1, nextSum = 1;
        for (int i = 0; compare(Math.abs(nextSum), acc) >= 0; i++) {
            nextSum *= (x / i);
            sum += nextSum;
        }

        StringBuilder dec = new StringBuilder("##.");
        for (int i = 0; i < acc; i++ ) dec.append("#");
//        String dec = "%." + acc + "f";
//        String str = String.format(dec, sum);

        return Precision.round(sum, (int)acc);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    private static int compare(double a, double b) {
        if (a == b) return 0;
        else if (a < b) return -1;
        return 1;
    }
}// Вычисление функции exp(x) с помощью разложения в ряд Тейлора с точностью acc//
