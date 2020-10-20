package com.epam;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HelloWorldProTest {
    @Test
    public void positive() {
        Assert.assertTrue(true);
    }

    @Test
    public void negative() {
        Assert.assertFalse(false);
    }
}
