package ru.ssad;

public class LongDistantTrackingScreen extends TrackingScreen {

    public Tracking createScreen() {
        return new LongDistantTracking();
    }
}
