package ru.ssad;

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
