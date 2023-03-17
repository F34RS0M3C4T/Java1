
import org.junit.Assert;
import org.junit.Test;

public class TestPoint {
    @Test
    public void testPoint3D(){
        Point3D point3D = new Point3D(1, 2, 3);
        point3D.showPoint();
        point3D = new Point3D();
        point3D.showPoint();
        point3D.setX(1);
        point3D.showPoint();
        Assert.assertEquals(point3D, point3D);
    }
}
