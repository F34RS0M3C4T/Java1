import org.junit.Test;

public class TestTaylor {
    @Test
    public void testTaylor(){
        try {
            double ans = Exp.taylorSeries(11, 20);
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
