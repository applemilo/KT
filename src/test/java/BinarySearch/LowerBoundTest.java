package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LowerBoundTest {
    private LowerBound lowerBound;
    private int[]arr;

    @BeforeMethod
    public void setup(){
        lowerBound = new LowerBound();
        arr = new int[]{1, 2, 2, 2, 4, 5, 6};
    }

    @Test
    public void testApproach1() {
        Assert.assertEquals(lowerBound.approach1(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach1(arr, 4), 4);
    }

    @Test
    public void testApproach2() {
        Assert.assertEquals(lowerBound.approach2(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach2(arr, 4), 4);
    }

    @Test
    public void testApproach3() {
        Assert.assertEquals(lowerBound.approach3(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach3(arr, 4), 4);
    }

    @Test
    public void testApproach4() {
        Assert.assertEquals(lowerBound.approach4(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach4(arr, 4), 4);
    }
}