package org.launchcode.java.demos.lsn5unittesting.test;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class CarTest {

    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }


    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }


    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }



    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001 );
    }

    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(550);
        assertEquals(500, test_car.getOdometer(), 0.001);
        assertEquals(0, test_car.getGasTankLevel(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverFillException() {
        test_car.addGas(5);
        fail("Can't exceed tank size");
    }

}
