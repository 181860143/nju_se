package com.amaze.filemanager.ui.activities;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class AboutActivityTest{
    @Test
    public void testAdd() {
        Assert.assertEquals(3,AboutActivity.add(1,2));
    }
    @Test
    public void testAddError() {
        Assert.assertEquals(4,AboutActivity.add(1,2));
    }
}