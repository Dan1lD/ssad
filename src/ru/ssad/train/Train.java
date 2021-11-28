package ru.ssad.train;

import ru.ssad.admin.StationAdmin;

public abstract class Train {
    StationAdmin adminOfNextStation;

    abstract void setAdminOfNextStation(StationAdmin admin);
    abstract void notifyAdmin(int delay, StationAdmin admin);
}
