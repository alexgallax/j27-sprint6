package edu.praktikum.sprint6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ShipParamsTest {

    @Mock
    Sail sail;

    @Parameterized.Parameter
    public int power;
    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters(name = "Скорость корабля {1} при парусе площадью {0}")
    public static Object[][] data() {
        return new Object[][] {
                { 4, 16 },
                { 2, 8 }
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getMaxSpeed() {
        Ship ship = new Ship(sail);

        Mockito.when(sail.getMaxPower()).thenReturn(power);

        int actualResult = ship.getMaxSpeed();

        assertEquals(expectedResult, actualResult);
    }
}
