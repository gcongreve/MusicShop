package stockItems;

import enums.StockItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockItemTest {

    StockItem drumSticks;

    @Before
    public void before(){
        drumSticks = new StockItem("Good Sticks", StockItemType.DRUMSTICKS, 10);
    }

    @Test
    public void sellingPrice() {
        assertEquals(14, drumSticks.sellingPrice(), 0.01);
    }

    @Test
    public void getProfit() {
        assertEquals(4, drumSticks.getProfit(), 0.01);
    }

    @Test
    public void setMarkupPercent() {
        drumSticks.setMarkupPercent(50);
        assertEquals(15, drumSticks.sellingPrice(), 0.01);
    }

    @Test
    public void getName() {
        assertEquals("Good Sticks", drumSticks.getName());
    }

    @Test
    public void getType() {
        assertEquals(StockItemType.DRUMSTICKS, drumSticks.getType());
    }

    @Test
    public void getBoughtPrice() {
        assertEquals(10, drumSticks.getBoughtPrice(), 0.01);
    }

    @Test
    public void getMarkupPercent() {
        assertEquals(40, drumSticks.getMarkupPercent(), 0.01);
    }
}