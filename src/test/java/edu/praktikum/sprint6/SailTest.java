package edu.praktikum.sprint6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SailTest {

    @Test
    public void getMaxPowerTest() {
        Sail sail = new Sail(2);

        int actualResult = sail.getMaxPower();
        int expectedResult = 4;

        assertEquals(expectedResult, actualResult);
    }
}
