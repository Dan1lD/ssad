package ru.ssad.tracking;

public class FreightTracking implements Tracking {
    int id;

    public FreightTracking(int id) {
        this.id = id;
    }

    @Override
    public String getInfoFromDB() {
        // This case is just example
        return this.id + "    13:53    Military";
    }
}
