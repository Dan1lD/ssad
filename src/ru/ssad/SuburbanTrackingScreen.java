package ru.ssad;

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
