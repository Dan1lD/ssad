package ru.ssad.train;

import ru.ssad.admin.Admin;
import ru.ssad.db.LongDistantDB;

public class LongDistantTrain extends Train {
    public LongDistantTrain() {
        this.db = LongDistantDB.getInstance();
    }

    @Override
    void setAdminOfNextStation(Admin admin) {
        this.adminOfNextStation = admin;
    }

    @Override
    void notifyAdmin(int delay, Admin admin) {

    }
}
