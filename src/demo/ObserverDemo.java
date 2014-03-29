package demo;

import observer.Stock;
import observer.StockObserver;

/**
 * Created by Irfan on 27-03-14.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        StockObserver observer1 = new StockObserver("Stock Observer 1");
        StockObserver observer2 = new StockObserver("Stock Observer 2");
        StockObserver observer3 = new StockObserver("Stock Observer 3");
        StockObserver observer4 = new StockObserver("Stock Observer 4");

        stock.addObserver(observer1);
        stock.addObserver(observer2);
        stock.addObserver(observer3);
        stock.addObserver(observer4);

        System.out.println("\nSetting Stock Price to 10.");
        stock.update(10);

        stock.removeObserver(observer2);

        System.out.println("\nSetting Stock Price to 30.");
        stock.update(30);
    }
}
