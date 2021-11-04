package ru.ssad.tracking_screen;

import ru.ssad.tracking.Tracking;

import java.util.ArrayList;

public abstract class TrackingScreen {

    ArrayList<Tracking> trackings = new ArrayList<>();

    public abstract Tracking createTracking(int id);
    /* Creates tracking that can get information from database using info about type of screen */

    public void drawTimetable() {
        this.drawHeadOfTimetable();
        for(Tracking tracking: trackings) {
            System.out.println(tracking.getInfoFromDB() + "\n");
        }
    }

    protected abstract void drawHeadOfTimetable();
}

