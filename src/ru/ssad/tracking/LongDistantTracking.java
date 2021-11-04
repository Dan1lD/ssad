package ru.ssad.tracking;

public class LongDistantTracking implements Tracking {
    int id;

    public LongDistantTracking(int id) {
        this.id = id;
    }

    @Override
    public String getInfoFromDB() {
        // This case is just example
        return this.id + "    13:47    14:32";
    }
}
