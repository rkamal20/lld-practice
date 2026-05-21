package src.designpatterns.behavioral.observer;

public interface Subject {
    void addObserver(NotificationObserver o);
    void removeObserver(NotificationObserver o);
    void notifyObservers();
}
