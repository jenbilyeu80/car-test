package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);

    }
    @Test
    public void emptyTest(){
        test_car=new Car("Toyota", "Prius", 10, 50);
    }
        @Test
        public void testInitialGasTank() {
            Car test_car = new Car("Toyota", "Prius", 10, 50);
            assertEquals(10, test_car.getGasTankLevel(), .001);

        }
        @Test
        public void testGasTankAfterDriving() {
            test_car.drive(50);
            assertEquals(9, test_car.getGasTankLevel(), .001);
        }
@Test
    public void testGasTankAfterExceedingTankRange(){
        test_car.drive(600);
     assertEquals(500, test_car.getOdometer(), .001);
}
@Test(expected = IllegalArgumentException.class)
    public void testGasOverFillException(){
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
}
    }

