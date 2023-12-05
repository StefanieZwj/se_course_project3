package com.example.tritypejunittest;

import org.junit.Assert;
import org.junit.Test;

public class TritypeLineBranchTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        Assert.assertEquals(4, tri.Triang(1, 2, 7));
        Assert.assertEquals(4, tri.Triang(1, 1, 2));
        Assert.assertEquals(4,tri.Triang(-1,-1,-1));
        Assert.assertEquals(1,tri.Triang(3,4,5));
        Assert.assertEquals(2,tri.Triang(3,3,5));
        Assert.assertEquals(2,tri.Triang(5,3,3));
        Assert.assertEquals(2,tri.Triang(3,5,3));
        Assert.assertEquals(3,tri.Triang(3,3,3));

    }
}