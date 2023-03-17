
import org.junit.Test;

public class TestQuadraticEquation {
    @Test
    public void testQuadraticEquation(){
        QuadraticEquation.QEquation(-1, -2, 3);
        QuadraticEquation.QEquation(1, -2, -3);
        QuadraticEquation.QEquation(1, 12, 36);
        QuadraticEquation.QEquation(90, 12, 36);
    }
}
