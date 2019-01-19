package instruments;

import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Pianotor", "Wood", "blue", 2000, 24, "plink plonk");
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("blue", piano.getColour());
    }

    @Test
    public void getBoughtPrice() {
        assertEquals(2000, piano.getBoughtPrice());
    }

    @Test
    public void play() {
        assertEquals("plink plonk", piano.play());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(24, piano.getNumberOfKeys());
    }
}