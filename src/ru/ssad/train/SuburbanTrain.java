package ru.ssad.train;

import ru.ssad.admin.StationAdmin;

public class SuburbanTrain extends Train {

    @Override
    void setAdminOfNextStation(StationAdmin admin) {
        this.adminOfNextStation = admin;
    }

    @Override
    protected void notifyAdmin(int delay, StationAdmin admin) {

    }
}
