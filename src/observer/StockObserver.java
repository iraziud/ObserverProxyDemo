package observer;

/**
 * @author zainmaqsood, irfanraziuddin
 */
public class StockObserver implements Observer {
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int price) {
        System.out.println("[ " + name + " ] " + "Stock Price Changed to : " + price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StockObserver) {
            StockObserver observer = (StockObserver) obj;
            return name == null ? observer.name==null : name.equals(observer.name);
        }
        return false;
    }
}
