package stockItems;

import behaviours.ISell;
import enums.StockItemType;

public class StockItem implements ISell {

    private String name;
    private StockItemType type;
    private double boughtPrice;
    private double markupPercent;

    public StockItem(String name, StockItemType type, double boughtPrice) {
        this.name = name;
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.markupPercent = 40;
    }


    @Override
    public double sellingPrice() {
        double percent = markupPercent/100;
        double addOn = boughtPrice * percent;
        return boughtPrice + addOn;
    }

    @Override
    public double getProfit() {
        return sellingPrice() - boughtPrice;
    }

    public void setMarkupPercent(double markupPercent) {
        this.markupPercent = markupPercent;
    }

    public String getName() {
        return name;
    }

    public StockItemType getType() {
        return type;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getMarkupPercent() {
        return markupPercent;
    }
}
