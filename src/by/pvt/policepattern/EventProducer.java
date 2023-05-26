package by.pvt.policepattern;

public interface EventProducer {
    void addObserver(Observer observer);
    void print(String message);
}
