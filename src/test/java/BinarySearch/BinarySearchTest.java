package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BinarySearchTest {
    private LowerBound lowerBound;
    private UpperBound upperBound;
    private int[]arr;

    @BeforeMethod
    public void setup(){
        lowerBound = new LowerBound();
        upperBound = new UpperBound();
        arr = new int[]{1, 2, 2, 2, 4, 5, 6};
    }

    @Test(testName = "(]")
    public void testApproach1() {
        Assert.assertEquals(lowerBound.approach1(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach1(arr, 4), 4);
        Assert.assertEquals(upperBound.approach1(arr, 3), 3);
    }

    @Test(testName = "()")
    public void testApproach2() {
        Assert.assertEquals(lowerBound.approach2(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach2(arr, 4), 4);
        Assert.assertEquals(upperBound.approach2(arr, 3), 3);
    }

    @Test(testName = "[]")
    public void testApproach3() {
        Assert.assertEquals(lowerBound.approach3(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach3(arr, 4), 4);
        Assert.assertEquals(upperBound.approach3(arr, 3), 3);
    }

    @Test(testName = "[)")
    public void testApproach4() {
        Assert.assertEquals(lowerBound.approach4(arr, 2), 1);
        Assert.assertEquals(lowerBound.approach4(arr, 4), 4);
        Assert.assertEquals(upperBound.approach4(arr, 3), 3);
    }

    @Test
    public void testTransform(){
        //>target, target is 3, upperbound+1, or lowerbound(target+1)
        Assert.assertEquals(upperBound.approach1(arr,3)+1, lowerBound.approach1(arr,4));
    }
}