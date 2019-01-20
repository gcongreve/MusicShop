package MusicShop;

import behaviours.ISell;
import instruments.Instrument;
import stockItems.StockItem;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private Till till;
    private String name;


    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = new Till(20);
    }

    public double getInstrumentMarkup(Instrument instrument){
        return instrument.getMarkup();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double getTillTotal() {
        return till.getCurrentTotal();
    }

    public void addMoneyToTill(double money){
        till.addMoney(money);
    }

    public void removeMoneyFromTill(double money){
        till.removeMoney(money);
    }

    public void addItemsToStock(ISell stockItem){
        this.stock.add(stockItem);
    }

    public void removeItemFromStock(ISell stockItem){
        this.stock.remove(stockItem);
    }

    public double potentialProfit(){
        double profit = 0;
        for (ISell stockItem : stock ){
           profit += stockItem.getProfit();
        }
        return profit;
    }

    public double stockValue(){
        double value = 0;
        for (ISell stockThing : stock){
            if (stockThing instanceof Instrument){
                Instrument instrument = ((Instrument) stockThing);
                value += instrument.getBoughtPrice();
            }
            else if (stockThing instanceof StockItem){
                StockItem stockItem = ((StockItem) stockThing);
                value += stockItem.getBoughtPrice();
            }
        }
        return value;
    }

    public void sellItem(ISell item){
        addMoneyToTill(item.sellingPrice());
        removeItemFromStock(item);
    }

    public void changeMarkupOfItem(ISell item, Double markupChange){
        if (item instanceof Instrument){
            Instrument instrument = ((Instrument) item);
            instrument.setMarkup(markupChange);
        }
        else if (item instanceof StockItem){
            StockItem stockItem = ((StockItem) item);
            stockItem.setMarkupPercent(markupChange);
        }
    }


}
