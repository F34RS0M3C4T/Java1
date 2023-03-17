
import org.junit.Assert;
import org.junit.Test;

public class TestVector {
    @Test
    public void testVector3D(){
        Vector3D vector = new Vector3D();
        Assert.assertEquals(0, vector.getLength(), 1e-10);
        vector.setX(3);
        vector.setY(4);
        Assert.assertEquals(5, vector.getLength(), 1e-10);
    }
}
