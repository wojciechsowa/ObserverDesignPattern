package pl.wat.ai.observer;

import pl.wat.ai.interfaces.Observer;

/**
 * Implementacja interfejsu Observer
 * na przykładzie użytkownika YouTube.
 */
public class YTUser implements Observer {
    private String name;
    private int videosToWatch;

    public YTUser(String name) {
        this.name = name;
        videosToWatch = 0;
    }

    @Override
    public void update() {
        videosToWatch++;
        System.out.println("Użytkowniku " + name +
                            ", pojawił się nowy film na kanale, " +
                            "który subskrybujesz. Liczba filmów " +
                            "do obejrzenia: " + videosToWatch + ".");
    }
}
