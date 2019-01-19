package MusicShop;

public class Till {

    private double currentTotal;

    public Till(double currentTotal) {
        this.currentTotal = currentTotal;
    }

    public double getCurrentTotal() {
        return currentTotal;
    }

    public void addMoney(double money){
        currentTotal += money;
    }

    public void removeMoney(double money){
        currentTotal -= money;
    }
}
