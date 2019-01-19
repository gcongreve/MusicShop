package instruments;

import behaviours.IPlay;
import enums.InstrumentType;

public abstract class Instrument implements IPlay{

    private String modelName;
    private String material;
    private String colour;
    private int boughtPrice;
    private String instrumentNoise;

    public Instrument(String modelName, String material, String colour, int boughtPrice, String instrumentNoise) {
        this.modelName = modelName;
        this.material = material;
        this.colour = colour;
        this.boughtPrice = boughtPrice;
        this.instrumentNoise = instrumentNoise;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public String play(){
        return instrumentNoise;
    }


}
