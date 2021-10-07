package ru.ssad;

public class LongDistantTracking implements Tracking {
    int id;

    LongDistantTracking(int id) {
        this.id = id;
    }

    @Override
    public String getInfoFromDB() {
        // This case is just example
        return this.id + "    13:47    14:32";
    }
}
