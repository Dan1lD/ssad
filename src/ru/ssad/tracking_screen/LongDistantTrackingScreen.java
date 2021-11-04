package ru.ssad.tracking_screen;

import ru.ssad.tracking.LongDistantTracking;
import ru.ssad.tracking.Tracking;

public class LongDistantTrackingScreen extends TrackingScreen {

    public Tracking createTracking(int id) {
        LongDistantTracking newTracking = new LongDistantTracking(id);
        trackings.add(newTracking);
        return newTracking;
    }

    @Override
    protected void drawHeadOfTimetable() {
        System.out.println("ID      Arrival  Departure");
    }
}
