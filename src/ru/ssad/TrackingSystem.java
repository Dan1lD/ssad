package ru.ssad;

public class TrackingSystem {

    private static TrackingSystem instance;

    public static synchronized TrackingSystem getInstance() {
        if (instance == null) {
            instance = new TrackingSystem();
        }
        return instance;
    }

    private TrackingSystem() {

    }
}
