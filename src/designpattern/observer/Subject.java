package src.designpattern.observer;

public interface Subject {
    void addObserver(NotificationObserver o);
    void removeObserver(NotificationObserver o);
    void notifyObservers();
}
