package observer;

/**
 * Created by Irfan on 27-03-14.
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void update(int price);
}
