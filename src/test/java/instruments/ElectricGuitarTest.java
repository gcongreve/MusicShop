package instruments;

import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void before(){
        electricGuitar = new ElectricGuitar("Fender", "Wood", "Lavender", 500,
                "twang", 6, 24);
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.GUITAR, electricGuitar.getInstrumentType());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(6, electricGuitar.getNumberOfStrings());
    }

    @Test
    public void play() {
        assertEquals("twang", electricGuitar.play());
    }

    @Test
    public void getNumberOfVolts() {
        assertEquals(24, electricGuitar.getNumberOfVolts());
    }

    @Test
    public void getMarkupPercent(){
        assertEquals(20, electricGuitar.getMarkup(), 0.01);
    }

    @Test
    public void getSellingPrice(){
        assertEquals(600, electricGuitar.sellingPrice(), 0.01);
    }

    @Test
    public void canChangeMarkup(){
        electricGuitar.setMarkup(10);
        assertEquals(550, electricGuitar.sellingPrice(), 0.01);
    }

    @Test
    public void canGetProfit(){
        assertEquals(100, electricGuitar.getProfit(), 0.01);
    }
}