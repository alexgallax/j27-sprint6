package edu.praktikum.sprint6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ShipTest {

    @Mock
    Sail sail;

    @Test
    public void getMaxSpeedTest() {
        Ship ship = new Ship(sail);

        Mockito.when(sail.getMaxPower()).thenReturn(4);

        int actualResult = ship.getMaxSpeed();
        int expectedResult = 16;

        assertEquals(expectedResult, actualResult);
    }
}
