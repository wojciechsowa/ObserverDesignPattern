package pl.wat.ai.observer;

import pl.wat.ai.interfaces.Observer;
import pl.wat.ai.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementacja interfejsu Subject
 * na przykładzie kanału YouTube.
 */
public class YTChannel implements Subject {
    private List<Observer> observerList;

    public YTChannel() {
        this.observerList = new ArrayList<>();
    }

    public void publishNewVideo() {
        System.out.println("YTChannel: Nowy film opublikowany.");
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update();
        }
    }
}
