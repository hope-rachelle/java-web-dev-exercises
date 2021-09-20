package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import static org.junit.Assert.*;

public class CatTest {
    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard",7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
    @Test
    public void inheritsDefaultInSecondConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard");
        assertNotNull(keyboardCat.getWeight());
    }
    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }

}
