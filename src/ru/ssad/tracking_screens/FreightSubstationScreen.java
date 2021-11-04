package ru.ssad.tracking_screens;

import ru.ssad.trackings.FreightTracking;
import ru.ssad.trackings.Tracking;

public class FreightSubstationScreen extends TrackingScreen {

    public Tracking createTracking(int id) {
        Tracking newTracking = new FreightTracking(id);
        this.trackings.add(newTracking);
        return newTracking;
    }

    @Override
    protected void drawHeadOfTimetable() {
        System.out.println("ID      Arrival  Type");
    }
}
