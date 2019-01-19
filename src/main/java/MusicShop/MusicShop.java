package MusicShop;

import behaviours.ISell;
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
}
