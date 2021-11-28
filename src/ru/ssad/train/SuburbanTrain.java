package ru.ssad.train;

import ru.ssad.admin.Admin;
import ru.ssad.db.SuburbanDB;

public class SuburbanTrain extends Train {
    public SuburbanTrain() {
        this.db = SuburbanDB.getInstance();
    }

    @Override
    void setAdminOfNextStation(Admin admin) {
        this.adminOfNextStation = admin;
    }

    @Override
    void notifyAdmin(int delay, Admin admin) {

    }
}
