package proxy;

import observer.Stock;
import observer.StockObserver;

/**
 * Created by Irfan on 27-03-14.
 */
public class StockProxy {
    private Stock stock;

    public StockProxy() {
        stock = new Stock();
    }
    public void addStockObserver(String name) {
        stock.addObserver(new StockObserver(name));
    }

    public void removeStockObserver(String name) {
        stock.removeObserver(new StockObserver(name));
    }

    public void updateStockPrice(int price) {
        stock.update(price);
    }
}
