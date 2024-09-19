package org.launchcode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;
    @BeforeEach
    public void createObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);

    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

    @Test
    public void EmptyTest(){
        assertEquals(10, 10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevel(){
        test_car.drive(100);
        assertEquals(8, test_car.getGasTankLevel());
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankLevelRange(){
        test_car.drive(500);
        System.out.println(test_car.getGasTankLevel());
        assertEquals(0, test_car.getGasTankLevel());
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void testGasLevel(){
        assertEquals(true, test_car.getGasTankLevel() <= test_car.getGasTankSize());
    }
}