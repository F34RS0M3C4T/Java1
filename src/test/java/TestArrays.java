
import org.junit.Assert;
import org.junit.Test;

public class TestArrays {
    private int[] arr1 = new int[]{1, -2, 3, 5};
    private int[] arr2 = new int[]{53, 26, 46, 65};

    @Test
    public void testPrintArray(){
        Arrays.printArray(arr1);
    }

    @Test
    public void testFillArray(){

    }

    @Test
    public void testElementAddition(){
        Assert.assertEquals(7, Arrays.elementAddition(arr1));
    }

    @Test
    public void testEvenNumbers(){
        Assert.assertEquals(3, Arrays.evenNumbers(arr1));
        Assert.assertEquals(2, Arrays.evenNumbers(arr2));
    }

    @Test
    public void testSection(){
        Assert.assertEquals(2, Arrays.section(arr2, 20, 50));
        Assert.assertEquals(3, Arrays.section(arr2, 0, 54));
    }

    @Test
    public void testIsAllPositive(){
        Assert.assertTrue(Arrays.isAllPositive(arr2));
        Assert.assertFalse(Arrays.isAllPositive(arr1));
    }

    @Test
    public void testInversion(){
        int[] exp = new int[]{
                5, 3, -2, 1
        };

        Arrays.inversion(arr1);
        Assert.assertArrayEquals(exp, arr1);
        Arrays.inversion(arr1);
    }
}
