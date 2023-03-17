
import org.junit.Assert;
import org.junit.Test;

public class VectorProcessor {
    Vector3D vector1 = new Vector3D(9, 4, 5);
    Vector3D vector2 = new Vector3D(1, 2, 3);
    @Test
    public void testAdditionSubtraction(){
        Assert.assertEquals(new Vector3D(8, 2, 2), Vector3DProcessor.subtraction(vector1, vector2));
        Assert.assertEquals(new Vector3D(10, 6, 8), Vector3DProcessor.addition(vector1, vector2));
    }

    @Test
    public void testIsCollinear(){
        Assert.assertFalse(Vector3DProcessor.isCollinear(vector1, vector2));
        Vector3D temp1 = new Vector3D(1, 0, 0);
        Vector3D temp2 = new Vector3D(2, 0, 0);
        Assert.assertTrue(Vector3DProcessor.isCollinear(temp1, temp2));

//        Vector3D temp3 = new Vector3D(1, 0, 0);
//        Vector3D temp4 = new Vector3D(0, 0, 1);
//        Assert.assertFalse(Vector3DProcessor.isCollinear(temp3, temp4));
    }

    @Test
    public void testDotProduct(){
        Assert.assertEquals(32.0, Vector3DProcessor.dotProduct(vector1, vector2), 1e-10);
    }

    @Test
    public void testCrossProduct(){
        Assert.assertEquals(new Vector3D(2, -22, 14), Vector3DProcessor.crossProduct(vector1, vector2));
    }
}
