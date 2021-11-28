package ru.ssad.train;

import ru.ssad.admin.Admin;
import ru.ssad.db.FreightDB;

public class FreightTrain extends Train {
    public FreightTrain() {
        this.db = FreightDB.getInstance();
    }

    @Override
    void setAdminOfNextStation(Admin admin) {
        this.adminOfNextStation = admin;
    }

    @Override
    protected void notifyAdmin(int delay, Admin admin) {

    }
}
