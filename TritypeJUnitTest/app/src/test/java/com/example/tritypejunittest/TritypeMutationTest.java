package com.example.tritypejunittest;
import org.junit.Assert;
import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriangOne() {
        Tritype tri = new Tritype();
        TritypMutantOne tri1=new TritypMutantOne();
        //if (Side1 == Side2)
        Assert.assertEquals(tri.Triang(3,3,9),tri1.Triang(3,3,9));
    }
    @Test
    public void testTriangTwo() {
        Tritype tri = new Tritype();
        TritypMutantTwo tri2=new TritypMutantTwo();
        // original: else if (triOut == 1 && Side1+Side2 > Side3)
        Assert.assertEquals(tri.Triang(3,3,6),tri2.Triang(3,3,6));

    }
}
