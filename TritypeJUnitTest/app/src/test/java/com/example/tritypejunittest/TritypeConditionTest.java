package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TritypeConditionTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        //if(Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        Assert.assertEquals(4, tri.Triang(-1, -1, -1));




    }

}