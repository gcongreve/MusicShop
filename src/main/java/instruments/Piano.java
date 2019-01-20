package instruments;

import enums.InstrumentType;

public class Piano extends Keyboard {

    private int numberOfPedals;


    public Piano(String modelName, String material, String colour, int boughtPrice,
                 int numberOfKeys, int numberOfPedals, String instrumentNoise) {
        super(modelName, material, colour, boughtPrice, numberOfKeys, instrumentNoise);
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }
}
