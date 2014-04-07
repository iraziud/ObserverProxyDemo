package demo;

import proxy.StockProxy;

/**
 * @author zainmaqsood, irfanraziuddin
 */
public class ProxyDemo {

    public static void main(String[] args) {
        StockProxy stockProxy = new StockProxy();

        stockProxy.addStockObserver("Stock Observer 1");
        stockProxy.addStockObserver("Stock Observer 2");

        System.out.println("\nSetting Stock Price to 100.");
        stockProxy.updateStockPrice(100);

        stockProxy.addStockObserver("Stock Observer 3");
        stockProxy.addStockObserver("Stock Observer 4");

        System.out.println("\nSetting Stock Price to 200.");
        stockProxy.updateStockPrice(200);

        stockProxy.removeStockObserver("Stock Observer 3");

        System.out.println("\nSetting Stock Price to 500.");
        stockProxy.updateStockPrice(500);
    }
}
