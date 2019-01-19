package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.InstrumentType;

public abstract class Instrument implements IPlay, ISell {

    private String modelName;
    private String material;
    private String colour;
    private int boughtPrice;
    private String instrumentNoise;
    private double markupPercent;

    public Instrument(String modelName, String material, String colour, int boughtPrice, String instrumentNoise) {
        this.modelName = modelName;
        this.material = material;
        this.colour = colour;
        this.boughtPrice = boughtPrice;
        this.instrumentNoise = instrumentNoise;
        this.markupPercent = 20;
    }

    public double getMarkup() {
        return markupPercent;
    }

    public void setMarkup(double markup) {
        this.markupPercent = markup;
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

    public double sellingPrice(){
        double percent = markupPercent/100;
        double addOn = boughtPrice * percent;
        return boughtPrice + addOn;
    }

    public double getProfit(){
        return sellingPrice() - boughtPrice;
    }


}
