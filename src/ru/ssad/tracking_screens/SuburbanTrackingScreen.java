package ru.ssad.tracking_screens;

import ru.ssad.trackings.SuburbanTracking;
import ru.ssad.trackings.Tracking;

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
