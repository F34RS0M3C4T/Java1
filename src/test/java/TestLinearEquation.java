
import org.junit.Test;

public class TestLinearEquation {

    @Test
    public void testSimultaneousEquations(){
        LinearEquations.linearEquations(2, -1, 3, -1, 5, 7);
        System.out.println();
        LinearEquations.linearEquations(1, 1, 2, 2, 4, 8);
        System.out.println();
        LinearEquations.linearEquations(1, -1, -2, 1, 1, 1);
    }
}
