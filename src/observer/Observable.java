package observer;

/**
 * @author zainmaqsood, irfanraziuddin
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void update(int price);
}
