
import org.junit.Assert;
import org.junit.Test;

public class TestVectorArray {
    @Test
    public void testVectorArray(){
        Vector3DArray vectorArray = new Vector3DArray(8);
        vectorArray.changeVector(new Vector3D(1, 2, 3), 3);
        Assert.assertEquals(8, vectorArray.getSize());
        Assert.assertEquals(3, vectorArray.findVector(new Vector3D(1, 2, 3)));
        vectorArray.changeVector(new Vector3D(3, 3, 4), 1);
        vectorArray.changeVector(new Vector3D(3, 4, 4), 0);
        Assert.assertEquals(new Vector3D(7, 9, 11), vectorArray.sum());
        Assert.assertEquals(6.4, vectorArray.lengthOfLongestVector(), 1e-1);
    }

    @Test
    public void testLinearComb(){
        Vector3DArray vectorArray = new Vector3DArray(4);
        vectorArray.changeVector(new Vector3D(1, 2, 3), 3);
        vectorArray.changeVector(new Vector3D(3, 3, 4), 1);
        vectorArray.changeVector(new Vector3D(3, 4, 4), 0);
        Assert.assertEquals(new Vector3D(13, 18, 24), vectorArray.linearCombination(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testShift(){
        Vector3DArray vectorArray = new Vector3DArray(4);
        vectorArray.changeVector(new Vector3D(1, 2, 3), 0);
        vectorArray.changeVector(new Vector3D(3, 3, 4), 1);
        vectorArray.changeVector(new Vector3D(3, 4, 4), 2);

        Point3D[] exp = new Point3D[]{
                new Point3D(2, 3, 4),
                new Point3D(4, 4, 5),
                new Point3D(4, 5, 5),
                new Point3D(1, 1, 1)
        };

        Point3D[]actual = vectorArray.shift(new Point3D(1, 1, 1));
        Assert.assertArrayEquals(exp, actual);
    }
}
