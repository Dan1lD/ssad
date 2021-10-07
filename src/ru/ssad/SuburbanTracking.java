package ru.ssad;

public class SuburbanTracking implements Tracking {
    int id;

    SuburbanTracking(int id) {
        this.id = id;
    }

    @Override
    public String getInfoFromDB() {
        // This case is just example
        return this.id + "    13:43";
    }
}
