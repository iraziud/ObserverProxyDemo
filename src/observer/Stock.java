package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irfan on 27-03-14.
 */
public class Stock implements Observable {
    private List<Observer> observers;

    public Stock() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update(int price) {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
