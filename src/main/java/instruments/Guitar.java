package instruments;

import enums.InstrumentType;

public abstract class Guitar extends Instrument {

    int numberOfStrings;
    InstrumentType instrumentType;

    public Guitar(String modelName, String material, String colour, int boughtPrice, String instrumentNoise, int numberOfStrings) {
        super(modelName, material, colour, boughtPrice, instrumentNoise);
        this.numberOfStrings = numberOfStrings;
        this.instrumentType = InstrumentType.GUITAR;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
