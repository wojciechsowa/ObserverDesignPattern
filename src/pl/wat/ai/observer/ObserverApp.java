package pl.wat.ai.observer;

public class ObserverApp {
    public static void main(String[] args) {
        YTChannel ytChannel = new YTChannel();
        YTUser ytUser = new YTUser("WSOWA");

        ytChannel.register(ytUser);

        ytChannel.publishNewVideo();
        System.out.println("----------------------------------");
        
    }
}
