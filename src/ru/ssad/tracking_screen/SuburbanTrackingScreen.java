package ru.ssad.tracking_screen;

import ru.ssad.tracking.SuburbanTracking;
import ru.ssad.tracking.Tracking;

public class SuburbanTrackingScreen extends TrackingScreen {

    public Tracking createTracking(int id) {
        SuburbanTracking newTracking = new SuburbanTracking(id);
        trackings.add(newTracking);
        return newTracking;
    }

    @Override
    protected void drawHeadOfTimetable() {
        System.out.println("ID      Departure");
    }
}
