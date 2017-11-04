package pl.wat.ai.interfaces;

// interfejs podmiotu
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
