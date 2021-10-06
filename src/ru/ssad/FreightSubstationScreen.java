package ru.ssad;

public class FreightSubstationScreen extends TrackingScreen {
    public Tracking createScreen() {
        return new FreightTracking();
    }
}
