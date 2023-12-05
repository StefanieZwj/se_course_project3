package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TritypeMCDCTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        Assert.assertEquals(4, tri.Triang(0, 1, 1));//Side1 <= 0
        Assert.assertEquals(4, tri.Triang(1, 0, 1));//Side2 <= 0
        Assert.assertEquals(4, tri.Triang(1, 1, 0));//Side3 <= 0
        Assert.assertEquals(1, tri.Triang(3, 4, 5));//else
    }

}