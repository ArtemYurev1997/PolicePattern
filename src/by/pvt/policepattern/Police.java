package by.pvt.policepattern;

import java.util.ArrayList;
import java.util.List;

public class Police implements EventProducer {
    private static Police police;
    private List<Observer> observers;

    public Police() {

    }

    public static Police getInstance() {
        if(police == null) {
            return new Police();
        }
        return police;
    }

    @Override
    public void addObserver(Observer observer) {
        if(observers == null) {
            observers = new ArrayList();
        }
        observers.add(observer);
    }

    @Override
    public void print(String message) {
        observers.forEach(observer -> observer.generate(message));
        observers.forEach(observer -> observer.send(message));
    }
}
