package instruments;

import enums.InstrumentType;

public abstract class Keyboard extends Instrument {

    private int numberOfKeys;
    private InstrumentType type;


    public Keyboard(String modelName, String material, String colour, int boughtPrice,
                    int numberOfKeys, String instrumentNoise) {
        super(modelName, material, colour, boughtPrice, instrumentNoise);
        this.type = InstrumentType.KEYBOARD;
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public InstrumentType getType() {
        return type;
    }
}
