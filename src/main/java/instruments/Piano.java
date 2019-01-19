package instruments;

import enums.InstrumentType;

public class Piano extends Instrument {

    private int numberOfKeys;
    private InstrumentType type;


    public Piano(String modelName, String material, String colour, int boughtPrice, int numberOfKeys, String instrumentNoise) {
        super(modelName, material, colour, boughtPrice, instrumentNoise);
        this.type = InstrumentType.KEYBOARD;
        this.numberOfKeys = numberOfKeys;
    }

    public InstrumentType getType() {
        return type;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }


}
