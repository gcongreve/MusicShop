package MusicShop;

import behaviours.ISell;
import stockItems.StockItem;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private Till till;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
        this.till = new Till(20);
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
}
