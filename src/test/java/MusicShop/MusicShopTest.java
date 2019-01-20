package MusicShop;

import enums.StockItemType;
import instruments.ElectricGuitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import stockItems.StockItem;

import static org.junit.Assert.*;

public class MusicShopTest {

    MusicShop emptyShop;
    MusicShop musicShop;
    Piano piano;
    ElectricGuitar electricGuitar;
    StockItem drumSticks;
    StockItem sheetMusic;

    @Before
    public void before(){
        emptyShop = new MusicShop("Empto");
        musicShop = new MusicShop("Muso");
        piano = new Piano("Mr Piano", "wood", "lavender", 1000,
                40, 2, "plink plonk");
        electricGuitar = new ElectricGuitar("Fender", "metal", "pink",
                500, "twang", 6, 240);
        drumSticks = new StockItem("Good Drumsticks", StockItemType.DRUMSTICKS, 10);
        sheetMusic = new StockItem("Mr Boombastic", StockItemType.SHEETMUSIC, 5);
        musicShop.addItemsToStock(piano);
        musicShop.addItemsToStock(electricGuitar);
        musicShop.addItemsToStock(drumSticks);
    }

    @Test
    public void shopHasName(){
        assertEquals("Muso", musicShop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, emptyShop.getStock().size());
    }


    @Test
    public void getTillTotal() {
        assertEquals(20, emptyShop.getTillTotal(), 0.01);
    }

    @Test
    public void addMoneyToTill() {
        emptyShop.addMoneyToTill(30);
        assertEquals(50, emptyShop.getTillTotal(), 0.01);
    }

    @Test
    public void removeMoneyFromTill() {
        emptyShop.removeMoneyFromTill(10);
        assertEquals(10, emptyShop.getTillTotal(), 0.01);
    }

    @Test
    public void getStock() {
        assertEquals(3, musicShop.getStock().size());
    }

    @Test
    public void addItemsToStock() {
        musicShop.addItemsToStock(sheetMusic);
        assertEquals(4, musicShop.getStock().size());
    }

    @Test
    public void removeItemFromStock() {
        musicShop.removeItemFromStock(drumSticks);
        assertEquals(2, musicShop.getStock().size());
    }

    @Test
    public void getPotentialProfit(){
        assertEquals(304, musicShop.potentialProfit(), 0.01);
    }

    @Test
    public void getBoughtCostOfStock(){
        assertEquals(1510, musicShop.stockValue(), 0.01);
    }

    @Test
    public void canSellItem(){
        musicShop.sellItem(piano);
        assertEquals(1220, musicShop.getTillTotal(), 0.01);
        assertEquals(2, musicShop.getStock().size());
    }

    @Test
    public void canChangeMarkupOfInstrument(){
        emptyShop.addItemsToStock(piano);
        assertEquals(200, emptyShop.potentialProfit(), 0.01);
        emptyShop.changeMarkupOfItem(piano, 50.00);
        assertEquals(500, emptyShop.potentialProfit(), 0.01);
    }

    @Test
    public void canChangeMarkupOfStockItem(){
        emptyShop.addItemsToStock(sheetMusic);
        assertEquals(2, emptyShop.potentialProfit(), 0.01);
        emptyShop.changeMarkupOfItem(sheetMusic, 50.00);
        assertEquals(2.5, emptyShop.potentialProfit(), 0.01);
    }

    @Test
    public void canGetInstrumentMarkup(){
        assertEquals(20, musicShop.getInstrumentMarkup(piano), 0.01);
    }

}