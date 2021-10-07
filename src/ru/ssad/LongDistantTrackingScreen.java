package ru.ssad;

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
