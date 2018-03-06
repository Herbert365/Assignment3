package com.jacobs;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CollectionsTest extends TestCase {

    Collections collectionsObj = new Collections();
    public void testSetVehicle() throws Exception {
        collectionsObj.setVehicle("Ferrari","458 Italia",2015);
        Assert.assertEquals(collectionsObj.getMake()+collectionsObj.getModel() + collectionsObj.getYear(),"Ferrari" +"458 Italia" + 2015);
    }

    public void testSetMake() {
        collectionsObj.setMake("BMW");
        Assert.assertEquals("BMW","BMW");
    }

    public void testSetModel() {
        collectionsObj.setModel("M4");
        Assert.assertEquals("M4","M4");
    }

    public void testSetYear() {
        collectionsObj.setYear(2015);
        Assert.assertEquals(2015, 2015);
    }

    public void testGetMake() {
        collectionsObj.setMake("BMW");
        Assert.assertEquals("BMW", collectionsObj.getMake());
    }

    public void testGetYear() {
        collectionsObj.setYear(2015);
        Assert.assertEquals(2015,collectionsObj.getYear());
    }

    public void testGetModel() {
        collectionsObj.setModel("M4");
        Assert.assertEquals("M4", collectionsObj.getModel());
    }
}