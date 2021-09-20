package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComputerTests {
    Computer newComputer;

    @Before
    public void createNewComputerObject() {
        newComputer = new Computer(2020, "HP", true);
    }
    @Test
    public void constructorSetsValues(){
        assertEquals("HP", newComputer.getMake());
        assertTrue(newComputer.isHasKeyboard());
    }
    @Test
    public void indicatesIfChargeNeeded(){
        assertEquals("Low Battery, Plug in soon.", newComputer.needsCharging(15));
    }
    @Test
    public void indicatesIfUpdateNeeded(){
        assertEquals("Product is up to date.", newComputer.needsUpdate());
    }
}
