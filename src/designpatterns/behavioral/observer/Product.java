package src.designpatterns.behavioral.observer;

import java.util.*;

public class Product implements Subject {   

    List<NotificationObserver> observers = new ArrayList<>();
    private String name;
    private int stock;

    public Product(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;

        if(stock > 0) {
            notifyObservers();
        }
    }
    
    @Override
    public void addObserver(NotificationObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(NotificationObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver o : observers) {
            o.update(name);
        }
    }
}
