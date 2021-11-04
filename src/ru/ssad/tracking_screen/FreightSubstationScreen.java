package ru.ssad.tracking_screen;

import ru.ssad.tracking.FreightTracking;
import ru.ssad.tracking.Tracking;

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
