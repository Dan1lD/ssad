package ru.ssad.tracking;

public class SuburbanTracking implements Tracking {
    int id;

    public SuburbanTracking(int id) {
        this.id = id;
    }

    @Override
    public String getInfoFromDB() {
        // This case is just example
        return this.id + "    13:43";
    }
}
