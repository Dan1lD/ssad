package ru.ssad.train;

import ru.ssad.admin.Admin;
import ru.ssad.db.Database;

public abstract class Train {
    Database db;
    Admin adminOfNextStation;

    abstract void setAdminOfNextStation(Admin admin);
    abstract void notifyAdmin(int delay, Admin admin);
}
