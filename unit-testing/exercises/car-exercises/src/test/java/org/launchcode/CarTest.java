package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals( 10, test_car.getGasTankLevel(),.001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevel(){
        test_car.drive(100);
        assertEquals(8 , test_car.getGasTankLevel());
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankLevelPastRange(){
        test_car.drive(400);
        assertEquals(2, test_car.getGasTankLevel());
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void testGasOverfillException(){
        assertThrows(IllegalArgumentException.class, () -> );
        assertEquals(true, test_car.getGasTankSize() <= test_car.getGasTankLevel());
    }
}