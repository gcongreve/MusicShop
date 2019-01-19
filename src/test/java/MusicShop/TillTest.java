package MusicShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(50);
    }

    @Test
    public void getCurrentTotal() {
        assertEquals(50, till.getCurrentTotal(), 0.01);
    }

    @Test
    public void addMoney() {
        till.addMoney(50);
        assertEquals(100, till.getCurrentTotal(), 0.01);
    }

    @Test
    public void removeMoney() {
        till.removeMoney(25);
        assertEquals(25, till.getCurrentTotal(), 0.01);
    }
}